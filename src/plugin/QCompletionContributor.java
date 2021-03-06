package plugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Queues;
import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;

import plugin.psi.QLocalAssignment;
import plugin.psi.QTypes;
import plugin.psi.QUserAssignmentId;

public class QCompletionContributor extends CompletionContributor {

  private static final String INTELLIJ_SUFFIX = "IntellijIdeaRulezzz";
  public QCompletionContributor() {
    extend(CompletionType.BASIC,
        PlatformPatterns.psiElement(QTypes.USER_IDENTIFIER).withLanguage(QLanguage.INSTANCE),
        new CompletionProvider<CompletionParameters>() {
          public void addCompletions(@NotNull
              CompletionParameters parameters,
              ProcessingContext context,
              @NotNull CompletionResultSet resultSet) {
            String input = parameters.getPosition().getText();
            String userInput = input.substring(0, input.indexOf(INTELLIJ_SUFFIX));
            resultSet.caseInsensitive();
            List<QUserAssignmentId> qUserAssignmentIds = QUtil.findIdentifier(parameters.getOriginalFile().getProject());
            qUserAssignmentIds.addAll(getLocalVariables(parameters));
            qUserAssignmentIds.addAll(getCurrentFileSignature(parameters));
            for(QUserAssignmentId qUserAssignmentId : qUserAssignmentIds) {
              addToAutoSuggestion(qUserAssignmentId, resultSet, userInput);
            }
          }
        }
    );
  }

  private static void addToAutoSuggestion(QUserAssignmentId signature, CompletionResultSet resultSet, String userInput) {
    if(signature != null && signature.getText() != null && signature.getText().startsWith(userInput)) {
      String signatureName = signature.getText();
      if(signatureName.startsWith(".")) {
        signatureName = signatureName.substring(1);
      }
      resultSet.addElement(LookupElementBuilder.create(signatureName));
    }
  }

  private static List<QUserAssignmentId> getLocalVariables(CompletionParameters parameters) {
    PsiElement psiElement = parameters.getPosition();
    PsiElement topLevelAssignment = PsiTreeUtil.getTopmostParentOfType(psiElement, QLocalAssignment.class);
    List<QUserAssignmentId> result = new ArrayList<QUserAssignmentId>();
    Queue<PsiElement> children = Queues.newArrayDeque();
    if(topLevelAssignment != null) {
      Collections.addAll(children, topLevelAssignment.getChildren());
    }
    while(!children.isEmpty()) {
      PsiElement child = children.poll();
      Collections.addAll(children, child.getChildren());
      QLocalAssignment[] qLocalAssignments = PsiTreeUtil.getChildrenOfType(child, QLocalAssignment.class);
      if(qLocalAssignments == null) {
        continue;
      }
      for(QLocalAssignment qLocalAssignment : qLocalAssignments) {
        if (qLocalAssignment != null) {
          result.add(qLocalAssignment.getUserAssignmentId());
        }
      }
    }
    return result;
  }

  private static List<QUserAssignmentId> getCurrentFileSignature(CompletionParameters parameters) {
    PsiElement psiElement = parameters.getPosition();
    PsiElement topLevelAssignment = PsiTreeUtil.getTopmostParentOfType(psiElement, QLocalAssignment.class);
    List<QUserAssignmentId> result = new ArrayList<QUserAssignmentId>();
    PsiElement pre = topLevelAssignment;
    PsiElement next = topLevelAssignment;
    while (next != null) {
      if (next instanceof QLocalAssignment && ((QLocalAssignment)next).getUserAssignmentId() != null)
        result.add(((QLocalAssignment)next).getUserAssignmentId());
      next = next.getNextSibling();
    }
    while (pre != null) {
      if (pre instanceof QUserAssignmentId && ((QLocalAssignment)pre).getUserAssignmentId() != null)
        result.add(((QLocalAssignment)pre).getUserAssignmentId());
      pre = pre.getPrevSibling();
    }
    return result;
  }
}
