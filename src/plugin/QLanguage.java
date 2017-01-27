package plugin;

import com.intellij.lang.Language;

public class QLanguage extends Language {

  public static final QLanguage INSTANCE = new QLanguage();

  private QLanguage() {
    super("QLanguage");
  }
}
