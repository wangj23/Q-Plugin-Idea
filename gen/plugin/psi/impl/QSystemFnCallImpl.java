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

public class QSystemFnCallImpl extends QAstWrapperPsiElement implements QSystemFnCall {

  public QSystemFnCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QVisitor visitor) {
    visitor.visitSystemFnCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QVisitor) accept((QVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QIndex> getIndexList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QIndex.class);
  }

  @Override
  @NotNull
  public PsiElement getSystemIdentifier() {
    return findNotNullChildByType(SYSTEM_IDENTIFIER);
  }

}
