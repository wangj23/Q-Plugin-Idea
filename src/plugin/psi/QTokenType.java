package plugin.psi;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import com.intellij.psi.tree.IElementType;

import plugin.QLanguage;

public class QTokenType extends IElementType {
  public QTokenType(
      @NotNull
      @NonNls
          String debugName) {
    super(debugName, QLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "QTokenType." + super.toString();
  }
}
