package plugin.psi.impl;

import com.intellij.lang.ASTNode;

import plugin.QAstWrapperPsiElement;
import plugin.psi.QNamedElement;

public abstract class QNamedElementImpl extends QAstWrapperPsiElement implements QNamedElement {
  public QNamedElementImpl(ASTNode node) {
    super(node);
  }
}
