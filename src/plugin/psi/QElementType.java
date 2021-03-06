package plugin.psi;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import com.intellij.psi.tree.IElementType;

import plugin.QLanguage;

public class QElementType extends IElementType {
  public QElementType(@NotNull
  @NonNls
      String debugName) {
    super(debugName, QLanguage.INSTANCE);
  }
}
