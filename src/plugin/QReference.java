package plugin;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;

import plugin.psi.QUserId;

public class QReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
  private String name;

  public QReference(@NotNull
      PsiElement element, TextRange textRange) {
    super(element, textRange);
    name = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
  }

  @NotNull
  @Override
  public ResolveResult[] multiResolve(boolean incompleteCode) {
    Project project = myElement.getProject();
    final List<QUserId> qUserIds = QUtil.findIdentifierQUserId(project, name);
    List<ResolveResult> results = new ArrayList<ResolveResult>();
    for (QUserId qUserId : qUserIds) {
      results.add(new PsiElementResolveResult(qUserId));
    }
    return results.toArray(new ResolveResult[results.size()]);
  }

  @Nullable
  @Override
  public PsiElement resolve() {
    ResolveResult[] resolveResults = multiResolve(false);
    return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    Project project = myElement.getProject();
    List<QUserId> qUserIds = QUtil.findIdentifierQUserId(project);
    List<LookupElement> variants = new ArrayList<LookupElement>();
    for (final QUserId qUserId : qUserIds) {
      if (qUserId.getName() != null && qUserId.getName().length() > 0) {
        variants.add(LookupElementBuilder.create(qUserId).
            withIcon(QIcon.FILE).
            withTypeText(qUserId.getContainingFile().getName())
        );
      }
    }
    return variants.toArray();
  }
}
