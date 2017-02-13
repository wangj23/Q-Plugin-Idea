package plugin;

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter;

public class QPairedBraceMatcherAdapter extends PairedBraceMatcherAdapter {

  public QPairedBraceMatcherAdapter() {
    super(new QPairedBraceMatcher(), QLanguage.INSTANCE);
  }
}
