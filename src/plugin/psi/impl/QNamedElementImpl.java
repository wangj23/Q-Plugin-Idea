package plugin.psi.impl;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;

import plugin.QAstWrapperPsiElement;
import plugin.psi.QNamedElement;

public abstract class QNamedElementImpl extends QAstWrapperPsiElement implements QNamedElement {
  public QNamedElementImpl(ASTNode node) {
    super(node);
  }

  @Nullable
  @Override
  public PsiElement getNameIdentifier() {
    return null;
  }

  @Override
  public PsiElement setName(
      @NonNls
      @NotNull
          String s) throws IncorrectOperationException {
    return null;
  }
}
