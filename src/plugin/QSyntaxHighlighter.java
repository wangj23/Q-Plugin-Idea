package plugin;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

import java.awt.Color;
import java.awt.Font;

import org.jetbrains.annotations.NotNull;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;

import plugin.psi.QTypes;

public class QSyntaxHighlighter extends SyntaxHighlighterBase {
  public static final TextAttributesKey COMMENT =
      createTextAttributesKey("Q_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey STRING =
      createTextAttributesKey("Q_STRING", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey IDENTIFIER_ASSIGNMENT =
      createTextAttributesKey("Q_IDENTIFIER_ASSIGNMENT", new TextAttributes(Color.ORANGE, null, null, null, Font.BOLD));
  public static final TextAttributesKey CONTROL =
      createTextAttributesKey("Q_CONTROL", new TextAttributes(Color.CYAN, null, null, null, Font.BOLD));
  static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("Q_BAD_CHARACTER",
      new TextAttributes(Color.RED, null, null, null, Font.BOLD));

  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
  private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER_ASSIGNMENT};
  private static final TextAttributesKey[] CONTROL_KEYS = new TextAttributesKey[]{CONTROL};
  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
  private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new QLexerAdapter();
  }

  @NotNull
  @Override
  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(QTypes.COMMENT)) {
      return COMMENT_KEYS;
    } else if(tokenType.equals(QTypes.USER_ASSIGNMENT)) {
      return IDENTIFIER_KEYS;
    } else if (tokenType.equals(QTypes.IF) || tokenType.equals(QTypes.WHILE) || tokenType.equals(QTypes.DO) ||
        tokenType.equals(QTypes.IFELSE)) {
      return CONTROL_KEYS;
    } else if(tokenType.equals(QTypes.STRING)) {
      return STRING_KEYS;
    } else {
      return EMPTY_KEYS;
    }
  }
}
