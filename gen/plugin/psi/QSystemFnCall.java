// This is a generated file. Not intended for manual editing.
package plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QSystemFnCall extends PsiElement {

  @NotNull
  List<QIndex> getIndexList();

  @NotNull
  PsiElement getSystemIdentifier();

}
