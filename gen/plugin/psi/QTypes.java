// This is a generated file. Not intended for manual editing.
package plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import plugin.psi.impl.*;

public interface QTypes {

  IElementType COMMAND = new QElementType("COMMAND");
  IElementType DYAD = new QElementType("DYAD");
  IElementType EMPTY_INDEX = new QElementType("EMPTY_INDEX");
  IElementType GLOBAL_ASSIGNMENT = new QElementType("GLOBAL_ASSIGNMENT");
  IElementType GROUP = new QElementType("GROUP");
  IElementType INDEX = new QElementType("INDEX");
  IElementType LAMBDA = new QElementType("LAMBDA");
  IElementType LIST = new QElementType("LIST");
  IElementType LOCAL_ASSIGNMENT = new QElementType("LOCAL_ASSIGNMENT");
  IElementType MONAD = new QElementType("MONAD");
  IElementType SIGNAL = new QElementType("SIGNAL");
  IElementType SYSTEM_FN_CALL = new QElementType("SYSTEM_FN_CALL");
  IElementType TABLE = new QElementType("TABLE");
  IElementType TRACE = new QElementType("TRACE");
  IElementType USER_ASSIGNMENT_ID = new QElementType("USER_ASSIGNMENT_ID");
  IElementType USER_FN_CALL = new QElementType("USER_FN_CALL");
  IElementType USER_ID = new QElementType("USER_ID");

  IElementType ADVERB = new QTokenType("adverb");
  IElementType AMPERSAND = new QTokenType("&");
  IElementType ASTERISK = new QTokenType("*");
  IElementType AT = new QTokenType("@");
  IElementType BACK_SLASH = new QTokenType("\\");
  IElementType BACK_SLASH_COLON = new QTokenType("\\:");
  IElementType BACK_TICK = new QTokenType("`");
  IElementType BANG = new QTokenType("!");
  IElementType CARET = new QTokenType("^");
  IElementType CHAR = new QTokenType("char");
  IElementType CLOSE_BRACE = new QTokenType("}");
  IElementType CLOSE_BRACKET = new QTokenType("]");
  IElementType CLOSE_PAREN = new QTokenType(")");
  IElementType COLON = new QTokenType(":");
  IElementType COMMA = new QTokenType(",");
  IElementType COMMAND_NAME = new QTokenType("command_name");
  IElementType COMMENT = new QTokenType("comment");
  IElementType COMPOSED_MONAD = new QTokenType("composed_monad");
  IElementType DASH = new QTokenType("-");
  IElementType DERIVED_VERB = new QTokenType("derived_verb");
  IElementType DO = new QTokenType("do");
  IElementType EQUALS = new QTokenType("=");
  IElementType GREATER_THAN = new QTokenType(">");
  IElementType HASH = new QTokenType("#");
  IElementType IF = new QTokenType("if");
  IElementType IFELSE = new QTokenType("$");
  IElementType LESS_THAN = new QTokenType("<");
  IElementType NEWLINE = new QTokenType("newline");
  IElementType NUMBER = new QTokenType("number");
  IElementType NUMBER_VECTOR = new QTokenType("number_vector");
  IElementType N_COLON = new QTokenType("n_colon");
  IElementType OPEN_BRACE = new QTokenType("{");
  IElementType OPEN_BRACKET = new QTokenType("[");
  IElementType OPEN_PAREN = new QTokenType("(");
  IElementType PERCENT = new QTokenType("`%");
  IElementType PERIOD = new QTokenType(".");
  IElementType PIPE = new QTokenType("|");
  IElementType PLUS = new QTokenType("+");
  IElementType QUESTION_MARK = new QTokenType("?");
  IElementType QUOTE = new QTokenType("\"");
  IElementType SEMICOLON = new QTokenType(";");
  IElementType SLASH = new QTokenType("/");
  IElementType SLASH_COLON = new QTokenType("/:");
  IElementType STRING = new QTokenType("string");
  IElementType SYMBOL = new QTokenType("symbol");
  IElementType SYMBOL_VECTOR = new QTokenType("symbol_vector");
  IElementType SYSTEM_IDENTIFIER = new QTokenType("system_identifier");
  IElementType TICK = new QTokenType("'");
  IElementType TICK_COLON = new QTokenType("':");
  IElementType TILDE = new QTokenType("~");
  IElementType UNDERSCORE = new QTokenType("_");
  IElementType USER_ASSIGNMENT = new QTokenType("user_assignment");
  IElementType USER_IDENTIFIER = new QTokenType("user_identifier");
  IElementType VERB = new QTokenType("verb");
  IElementType WHILE = new QTokenType("while");
  IElementType WHITESPACE = new QTokenType(" ");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == COMMAND) {
        return new QCommandImpl(node);
      }
      else if (type == DYAD) {
        return new QDyadImpl(node);
      }
      else if (type == EMPTY_INDEX) {
        return new QEmptyIndexImpl(node);
      }
      else if (type == GLOBAL_ASSIGNMENT) {
        return new QGlobalAssignmentImpl(node);
      }
      else if (type == GROUP) {
        return new QGroupImpl(node);
      }
      else if (type == INDEX) {
        return new QIndexImpl(node);
      }
      else if (type == LAMBDA) {
        return new QLambdaImpl(node);
      }
      else if (type == LIST) {
        return new QListImpl(node);
      }
      else if (type == LOCAL_ASSIGNMENT) {
        return new QLocalAssignmentImpl(node);
      }
      else if (type == MONAD) {
        return new QMonadImpl(node);
      }
      else if (type == SIGNAL) {
        return new QSignalImpl(node);
      }
      else if (type == SYSTEM_FN_CALL) {
        return new QSystemFnCallImpl(node);
      }
      else if (type == TABLE) {
        return new QTableImpl(node);
      }
      else if (type == TRACE) {
        return new QTraceImpl(node);
      }
      else if (type == USER_ASSIGNMENT_ID) {
        return new QUserAssignmentIdImpl(node);
      }
      else if (type == USER_FN_CALL) {
        return new QUserFnCallImpl(node);
      }
      else if (type == USER_ID) {
        return new QUserIdImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
