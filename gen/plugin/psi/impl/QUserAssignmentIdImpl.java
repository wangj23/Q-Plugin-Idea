// This is a generated file. Not intended for manual editing.
package plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static plugin.psi.QTypes.*;
import plugin.psi.*;

public class QUserAssignmentIdImpl extends QNamedElementImpl implements QUserAssignmentId {

  public QUserAssignmentIdImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QVisitor visitor) {
    visitor.visitUserAssignmentId(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QVisitor) accept((QVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getUserAssignment() {
    return findNotNullChildByType(USER_ASSIGNMENT);
  }

}
