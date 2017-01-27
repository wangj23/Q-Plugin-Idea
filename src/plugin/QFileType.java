package plugin;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.openapi.fileTypes.LanguageFileType;

public class QFileType extends LanguageFileType {
  public static final QFileType INSTANCE = new QFileType();

  private QFileType() {
    super(QLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "QLanguage file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "QLanguage language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "q";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return QIcon.FILE;
  }

}
