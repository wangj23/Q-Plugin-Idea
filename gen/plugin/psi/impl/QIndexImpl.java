// This is a generated file. Not intended for manual editing.
package plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static plugin.psi.QTypes.*;
import plugin.QAstWrapperPsiElement;
import plugin.psi.*;

public class QIndexImpl extends QAstWrapperPsiElement implements QIndex {

  public QIndexImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QVisitor visitor) {
    visitor.visitIndex(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QVisitor) accept((QVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QDyad> getDyadList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QDyad.class);
  }

  @Override
  @NotNull
  public List<QGlobalAssignment> getGlobalAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QGlobalAssignment.class);
  }

  @Override
  @NotNull
  public List<QGroup> getGroupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QGroup.class);
  }

  @Override
  @NotNull
  public List<QIndex> getIndexList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QIndex.class);
  }

  @Override
  @NotNull
  public List<QLambda> getLambdaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QLambda.class);
  }

  @Override
  @NotNull
  public List<QList> getListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QList.class);
  }

  @Override
  @NotNull
  public List<QLocalAssignment> getLocalAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QLocalAssignment.class);
  }

  @Override
  @NotNull
  public List<QMonad> getMonadList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QMonad.class);
  }

  @Override
  @NotNull
  public List<QSignal> getSignalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QSignal.class);
  }

  @Override
  @NotNull
  public List<QSystemFnCall> getSystemFnCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QSystemFnCall.class);
  }

  @Override
  @NotNull
  public List<QTable> getTableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QTable.class);
  }

  @Override
  @NotNull
  public List<QTrace> getTraceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QTrace.class);
  }

  @Override
  @NotNull
  public List<QUserFnCall> getUserFnCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QUserFnCall.class);
  }

  @Override
  @NotNull
  public List<QUserId> getUserIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QUserId.class);
  }

}
