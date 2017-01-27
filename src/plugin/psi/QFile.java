package plugin.psi;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

import plugin.QFileType;
import plugin.QLanguage;

public class QFile extends PsiFileBase {
  public QFile(@NotNull
      FileViewProvider viewProvider) {
    super(viewProvider, QLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return QFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Q File";
  }

  @Override
  public Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}
