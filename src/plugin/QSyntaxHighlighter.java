package plugin;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

import java.awt.Color;
import java.awt.Font;

import org.jetbrains.annotations.NotNull;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;

import plugin.psi.QTypes;

public class QSyntaxHighlighter extends SyntaxHighlighterBase {
  private static final float[] SYMBOL_COLOR = Color.RGBtoHSB(0, 0, 255, null);
  private static final float[] VARIABLE_COLOR = Color.RGBtoHSB(255, 0, 0, null);
  private static final float[] OPERATOR_COLOR = Color.RGBtoHSB(0, 128, 128, null);
  private static final float[] RESERVE_WORD_COLOR = Color.RGBtoHSB(128, 128, 0, null);
  private static final float[] PARENS_COLOR = Color.RGBtoHSB(0, 0, 128, null);
  private static final float[] COMMENT_COLOR = Color.RGBtoHSB(0, 128, 0, null);
  private static final float[] STRING_COLOR = Color.RGBtoHSB(255, 0, 255, null);

  public static final TextAttributesKey SYMBOL = createTextAttributesKey("Q_SYMBOL",
      new TextAttributes(Color.getHSBColor(SYMBOL_COLOR[0], SYMBOL_COLOR[1], SYMBOL_COLOR[2]), null, null,
          null, Font.BOLD));
  public static final TextAttributesKey IDENTIFIER_ASSIGNMENT = createTextAttributesKey(
      "Q_IDENTIFIER_ASSIGNMENT",
      new TextAttributes(Color.getHSBColor(VARIABLE_COLOR[0], VARIABLE_COLOR[1], VARIABLE_COLOR[2]), null,
          null, null, Font.BOLD));
  public static final TextAttributesKey RESERVE_WORD = createTextAttributesKey("Q_RESERVE_WORD",
      new TextAttributes(
          Color.getHSBColor(RESERVE_WORD_COLOR[0], RESERVE_WORD_COLOR[1], RESERVE_WORD_COLOR[2]), null, null,
          null, Font.BOLD));
  public static final TextAttributesKey PARENS = createTextAttributesKey("Q_PARENS",
      new TextAttributes(Color.getHSBColor(PARENS_COLOR[0], PARENS_COLOR[1], PARENS_COLOR[2]), null, null,
          null, Font.BOLD));
  public static final TextAttributesKey COMMENT = createTextAttributesKey("Q_COMMENT",
      new TextAttributes(Color.getHSBColor(COMMENT_COLOR[0], COMMENT_COLOR[1], COMMENT_COLOR[2]), null, null,
          null, Font.BOLD));
  public static final TextAttributesKey STRING = createTextAttributesKey("Q_STRING",
      new TextAttributes(Color.getHSBColor(STRING_COLOR[0], STRING_COLOR[1], STRING_COLOR[2]), null, null,
          null, Font.BOLD));
  public static final TextAttributesKey OPERATOR = createTextAttributesKey(
      "Q_OPERATOR",
      new TextAttributes(Color.getHSBColor(OPERATOR_COLOR[0], OPERATOR_COLOR[1], OPERATOR_COLOR[2]), null,
          null, null, Font.BOLD));
  static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("Q_BAD_CHARACTER",
      new TextAttributes(Color.RED, null, null, null, Font.BOLD));

  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
  private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER_ASSIGNMENT};
  private static final TextAttributesKey[] RESERVE_WORD_KEYS = new TextAttributesKey[]{RESERVE_WORD};
  private static final TextAttributesKey[] SYMBOL_KEYS = new TextAttributesKey[] {SYMBOL};
  private static final TextAttributesKey[] PARENS_KEYS = new TextAttributesKey[] {PARENS};
  private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
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
        tokenType.equals(QTypes.CARET) || tokenType.equals(QTypes.OPEN_BRACKET) || tokenType.equals(QTypes.CLOSE_BRACKET)) {
      return RESERVE_WORD_KEYS;
    } else if(tokenType.equals(QTypes.STRING) || tokenType.equals(QTypes.CHAR)) {
      return STRING_KEYS;
    } else if(tokenType.equals(QTypes.SYMBOL) || tokenType.equals(QTypes.SYMBOL_VECTOR)) {
      return SYMBOL_KEYS;
    } else if (tokenType.equals(QTypes.OPEN_PAREN) || tokenType.equals(QTypes.CLOSE_PAREN) ||
        tokenType.equals(QTypes.OPEN_BRACE) || tokenType.equals(QTypes.CLOSE_BRACE)) {
      return PARENS_KEYS;
    } else if (tokenType.equals(QTypes.COLON) || tokenType.equals(QTypes.SEMICOLON) ||
        tokenType.equals(QTypes.SLASH) || tokenType.equals(QTypes.BACK_SLASH) || tokenType.equals(QTypes.VERB)) {
      return OPERATOR_KEYS;
    } else {
      return EMPTY_KEYS;
    }
  }
}
