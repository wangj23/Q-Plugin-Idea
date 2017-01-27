package plugin;

import java.io.Reader;

import com.intellij.lexer.FlexAdapter;

public class QLexerAdapter extends FlexAdapter {
  public QLexerAdapter() {
    super(new _QLexer((Reader)null));
  }
}
