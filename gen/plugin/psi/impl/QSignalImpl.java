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

public class QSignalImpl extends QAstWrapperPsiElement implements QSignal {

  public QSignalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QVisitor visitor) {
    visitor.visitSignal(this);
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
  @Nullable
  public QGlobalAssignment getGlobalAssignment() {
    return findChildByClass(QGlobalAssignment.class);
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
  @Nullable
  public QLocalAssignment getLocalAssignment() {
    return findChildByClass(QLocalAssignment.class);
  }

  @Override
  @NotNull
  public List<QMonad> getMonadList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QMonad.class);
  }

  @Override
  @Nullable
  public QSignal getSignal() {
    return findChildByClass(QSignal.class);
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
  @Nullable
  public QTrace getTrace() {
    return findChildByClass(QTrace.class);
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
