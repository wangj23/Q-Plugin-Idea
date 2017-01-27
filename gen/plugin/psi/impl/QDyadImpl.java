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

public class QDyadImpl extends QAstWrapperPsiElement implements QDyad {

  public QDyadImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QVisitor visitor) {
    visitor.visitDyad(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QVisitor) accept((QVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QIndex getIndex() {
    return findChildByClass(QIndex.class);
  }

  @Override
  @Nullable
  public PsiElement getNColon() {
    return findChildByType(N_COLON);
  }

  @Override
  @Nullable
  public PsiElement getSystemIdentifier() {
    return findChildByType(SYSTEM_IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getVerb() {
    return findChildByType(VERB);
  }

}
