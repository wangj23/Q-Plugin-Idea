// This is a generated file. Not intended for manual editing.
package plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class QVisitor extends PsiElementVisitor {

  public void visitCommand(@NotNull QCommand o) {
    visitPsiElement(o);
  }

  public void visitDyad(@NotNull QDyad o) {
    visitPsiElement(o);
  }

  public void visitEmptyIndex(@NotNull QEmptyIndex o) {
    visitPsiElement(o);
  }

  public void visitGlobalAssignment(@NotNull QGlobalAssignment o) {
    visitPsiElement(o);
  }

  public void visitGroup(@NotNull QGroup o) {
    visitPsiElement(o);
  }

  public void visitIndex(@NotNull QIndex o) {
    visitPsiElement(o);
  }

  public void visitLambda(@NotNull QLambda o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull QList o) {
    visitPsiElement(o);
  }

  public void visitLocalAssignment(@NotNull QLocalAssignment o) {
    visitPsiElement(o);
  }

  public void visitMonad(@NotNull QMonad o) {
    visitPsiElement(o);
  }

  public void visitSignal(@NotNull QSignal o) {
    visitPsiElement(o);
  }

  public void visitSystemFnCall(@NotNull QSystemFnCall o) {
    visitPsiElement(o);
  }

  public void visitTable(@NotNull QTable o) {
    visitPsiElement(o);
  }

  public void visitTrace(@NotNull QTrace o) {
    visitPsiElement(o);
  }

  public void visitUserAssignmentId(@NotNull QUserAssignmentId o) {
    visitNamedElement(o);
  }

  public void visitUserFnCall(@NotNull QUserFnCall o) {
    visitPsiElement(o);
  }

  public void visitUserId(@NotNull QUserId o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull QNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
