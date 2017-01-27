// This is a generated file. Not intended for manual editing.
package plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static plugin.psi.QTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class QParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == COMMAND) {
      r = command(b, 0);
    }
    else if (t == DYAD) {
      r = dyad(b, 0);
    }
    else if (t == EMPTY_INDEX) {
      r = emptyIndex(b, 0);
    }
    else if (t == GLOBAL_ASSIGNMENT) {
      r = global_assignment(b, 0);
    }
    else if (t == GROUP) {
      r = group(b, 0);
    }
    else if (t == INDEX) {
      r = index(b, 0);
    }
    else if (t == LAMBDA) {
      r = lambda(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == LOCAL_ASSIGNMENT) {
      r = local_assignment(b, 0);
    }
    else if (t == MONAD) {
      r = monad(b, 0);
    }
    else if (t == SIGNAL) {
      r = signal(b, 0);
    }
    else if (t == SYSTEM_FN_CALL) {
      r = system_fn_call(b, 0);
    }
    else if (t == TABLE) {
      r = table(b, 0);
    }
    else if (t == TRACE) {
      r = trace(b, 0);
    }
    else if (t == USER_ASSIGNMENT_ID) {
      r = user_assignment_id(b, 0);
    }
    else if (t == USER_FN_CALL) {
      r = user_fn_call(b, 0);
    }
    else if (t == USER_ID) {
      r = user_id(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // verb+
  //              | composed_monad
  //              | derived_verb
  //              | colon [colon]
  //              | n_colon
  static boolean C0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C0_0(b, l + 1);
    if (!r) r = consumeToken(b, COMPOSED_MONAD);
    if (!r) r = consumeToken(b, DERIVED_VERB);
    if (!r) r = C0_3(b, l + 1);
    if (!r) r = consumeToken(b, N_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // verb+
  private static boolean C0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERB);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, VERB)) break;
      if (!empty_element_parsed_guard_(b, "C0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // colon [colon]
  private static boolean C0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && C0_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [colon]
  private static boolean C0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C0_3_1")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // command
  //              | E1
  //              | C0
  static boolean E0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "E0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command(b, l + 1);
    if (!r) r = E1(b, l + 1);
    if (!r) r = C0(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // separator
  //              | expression
  static boolean E1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "E1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // separator
  //              | E3
  static boolean E2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "E2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator(b, l + 1);
    if (!r) r = E3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  //              | C0
  static boolean E3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "E3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = C0(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // global_assignment | local_assignment
  static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, "", USER_ASSIGNMENT, USER_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_assignment(b, l + 1);
    if (!r) r = local_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | char
  static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    if (!nextTokenIs(b, "", CHAR, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // command_name (user_id | "^")
  public static boolean command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    r = r && command_1(b, l + 1);
    exit_section_(b, m, COMMAND, r);
    return r;
  }

  // user_id | "^"
  private static boolean command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_id(b, l + 1);
    if (!r) r = consumeToken(b, CARET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // colon | if | do | while | ifelse
  static boolean control(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, IFELSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (infixNoIndex | infixIndex) [adverb]
  public static boolean dyad(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DYAD, "<dyad>");
    r = dyad_0(b, l + 1);
    r = r && dyad_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // infixNoIndex | infixIndex
  private static boolean dyad_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixNoIndex(b, l + 1);
    if (!r) r = infixIndex(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [adverb]
  private static boolean dyad_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_1")) return false;
    consumeToken(b, ADVERB);
    return true;
  }

  /* ********************************************************** */
  // (noun dyad [E3]) | (noun_or_fn [(dyad [E3]) | expression])
  static boolean dyad_fn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dyad_fn_0(b, l + 1);
    if (!r) r = dyad_fn_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // noun dyad [E3]
  private static boolean dyad_fn_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noun(b, l + 1);
    r = r && dyad(b, l + 1);
    r = r && dyad_fn_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [E3]
  private static boolean dyad_fn_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_0_2")) return false;
    E3(b, l + 1);
    return true;
  }

  // noun_or_fn [(dyad [E3]) | expression]
  private static boolean dyad_fn_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noun_or_fn(b, l + 1);
    r = r && dyad_fn_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(dyad [E3]) | expression]
  private static boolean dyad_fn_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_1_1")) return false;
    dyad_fn_1_1_0(b, l + 1);
    return true;
  }

  // (dyad [E3]) | expression
  private static boolean dyad_fn_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dyad_fn_1_1_0_0(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dyad [E3]
  private static boolean dyad_fn_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dyad(b, l + 1);
    r = r && dyad_fn_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [E3]
  private static boolean dyad_fn_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dyad_fn_1_1_0_0_1")) return false;
    E3(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // open_bracket close_bracket
  public static boolean emptyIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emptyIndex")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    exit_section_(b, m, EMPTY_INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // whitespace* (signal | trace | assignment | dyad_fn | monad | noun)
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_0(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // whitespace*
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WHITESPACE)) break;
      if (!empty_element_parsed_guard_(b, "expression_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // signal | trace | assignment | dyad_fn | monad | noun
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal(b, l + 1);
    if (!r) r = trace(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = dyad_fn(b, l + 1);
    if (!r) r = monad(b, l + 1);
    if (!r) r = noun(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | symbol_vector | string (whitespace)* (comma)* | lambda | list | group | table
  static boolean fn_and_index_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_and_index_target")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, SYMBOL_VECTOR);
    if (!r) r = fn_and_index_target_2(b, l + 1);
    if (!r) r = lambda(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = group(b, l + 1);
    if (!r) r = table(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string (whitespace)* (comma)*
  private static boolean fn_and_index_target_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_and_index_target_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && fn_and_index_target_2_1(b, l + 1);
    r = r && fn_and_index_target_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (whitespace)*
  private static boolean fn_and_index_target_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_and_index_target_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WHITESPACE)) break;
      if (!empty_element_parsed_guard_(b, "fn_and_index_target_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (comma)*
  private static boolean fn_and_index_target_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_and_index_target_2_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "fn_and_index_target_2_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (control | derived_verb | verb) index+
  static boolean fn_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_call")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fn_call_0(b, l + 1);
    r = r && fn_call_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // control | derived_verb | verb
  private static boolean fn_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = control(b, l + 1);
    if (!r) r = consumeToken(b, DERIVED_VERB);
    if (!r) r = consumeToken(b, VERB);
    exit_section_(b, m, null, r);
    return r;
  }

  // index+
  private static boolean fn_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!index(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fn_call_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (user_id | user_assignment_id) colon colon expression
  public static boolean global_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_assignment")) return false;
    if (!nextTokenIs(b, "<global assignment>", USER_ASSIGNMENT, USER_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_ASSIGNMENT, "<global assignment>");
    r = global_assignment_0(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // user_id | user_assignment_id
  private static boolean global_assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_assignment_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_id(b, l + 1);
    if (!r) r = user_assignment_id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // open_paren E3 close_paren
  public static boolean group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && E3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, GROUP, r);
    return r;
  }

  /* ********************************************************** */
  // open_bracket E2* close_bracket
  public static boolean index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && index_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, INDEX, r);
    return r;
  }

  // E2*
  private static boolean index_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!E2(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "index_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (verb | adverb | system_identifier | derived_verb) [index]
  static boolean infixIndex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixIndex")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixIndex_0(b, l + 1);
    r = r && infixIndex_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // verb | adverb | system_identifier | derived_verb
  private static boolean infixIndex_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixIndex_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERB);
    if (!r) r = consumeToken(b, ADVERB);
    if (!r) r = consumeToken(b, SYSTEM_IDENTIFIER);
    if (!r) r = consumeToken(b, DERIVED_VERB);
    exit_section_(b, m, null, r);
    return r;
  }

  // [index]
  private static boolean infixIndex_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixIndex_1")) return false;
    index(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // n_colon
  static boolean infixNoIndex(PsiBuilder b, int l) {
    return consumeToken(b, N_COLON);
  }

  /* ********************************************************** */
  // open_brace [index] E1* close_brace
  public static boolean lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && lambda_1(b, l + 1);
    r = r && lambda_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, LAMBDA, r);
    return r;
  }

  // [index]
  private static boolean lambda_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_1")) return false;
    index(b, l + 1);
    return true;
  }

  // E1*
  private static boolean lambda_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!E1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambda_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // open_paren (([E3] separator [E3 | emptyIndex]) | emptyIndex separator (emptyIndex | E3))* close_paren
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && list_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // (([E3] separator [E3 | emptyIndex]) | emptyIndex separator (emptyIndex | E3))*
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ([E3] separator [E3 | emptyIndex]) | emptyIndex separator (emptyIndex | E3)
  private static boolean list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_1_0_0(b, l + 1);
    if (!r) r = list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [E3] separator [E3 | emptyIndex]
  private static boolean list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_1_0_0_0(b, l + 1);
    r = r && separator(b, l + 1);
    r = r && list_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [E3]
  private static boolean list_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_0_0")) return false;
    E3(b, l + 1);
    return true;
  }

  // [E3 | emptyIndex]
  private static boolean list_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_0_2")) return false;
    list_1_0_0_2_0(b, l + 1);
    return true;
  }

  // E3 | emptyIndex
  private static boolean list_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = E3(b, l + 1);
    if (!r) r = emptyIndex(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // emptyIndex separator (emptyIndex | E3)
  private static boolean list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyIndex(b, l + 1);
    r = r && separator(b, l + 1);
    r = r && list_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // emptyIndex | E3
  private static boolean list_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyIndex(b, l + 1);
    if (!r) r = E3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (user_id | user_assignment_id) [index] (colon expression | composed_monad [expression])
  public static boolean local_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment")) return false;
    if (!nextTokenIs(b, "<local assignment>", USER_ASSIGNMENT, USER_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, LOCAL_ASSIGNMENT, "<local assignment>");
    r = local_assignment_0(b, l + 1);
    r = r && local_assignment_1(b, l + 1);
    r = r && local_assignment_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // user_id | user_assignment_id
  private static boolean local_assignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_id(b, l + 1);
    if (!r) r = user_assignment_id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [index]
  private static boolean local_assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_1")) return false;
    index(b, l + 1);
    return true;
  }

  // colon expression | composed_monad [expression]
  private static boolean local_assignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_assignment_2_0(b, l + 1);
    if (!r) r = local_assignment_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colon expression
  private static boolean local_assignment_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // composed_monad [expression]
  private static boolean local_assignment_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSED_MONAD);
    r = r && local_assignment_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expression]
  private static boolean local_assignment_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_assignment_2_1_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // monad_fn E3
  public static boolean monad(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "monad")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MONAD, "<monad>");
    r = monad_fn(b, l + 1);
    r = r && E3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // verb | derived_verb | n_colon | colon
  static boolean monad_fn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "monad_fn")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERB);
    if (!r) r = consumeToken(b, DERIVED_VERB);
    if (!r) r = consumeToken(b, N_COLON);
    if (!r) r = consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // vector | atom
  static boolean noun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noun")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector(b, l + 1);
    if (!r) r = atom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fn_call | user_fn_call | user_id | system_fn_call | system_identifier | fn_and_index_target [index+]
  static boolean noun_or_fn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noun_or_fn")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fn_call(b, l + 1);
    if (!r) r = user_fn_call(b, l + 1);
    if (!r) r = user_id(b, l + 1);
    if (!r) r = system_fn_call(b, l + 1);
    if (!r) r = consumeToken(b, SYSTEM_IDENTIFIER);
    if (!r) r = noun_or_fn_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fn_and_index_target [index+]
  private static boolean noun_or_fn_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noun_or_fn_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fn_and_index_target(b, l + 1);
    r = r && noun_or_fn_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [index+]
  private static boolean noun_or_fn_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noun_or_fn_5_1")) return false;
    noun_or_fn_5_1_0(b, l + 1);
    return true;
  }

  // index+
  private static boolean noun_or_fn_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noun_or_fn_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!index(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "noun_or_fn_5_1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // E0 + separator_or_eof
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && separator_or_eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // E0 +
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = E0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!E0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // semicolon | newline
  static boolean separator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator")) return false;
    if (!nextTokenIs(b, "", NEWLINE, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, NEWLINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // separator | <<eof>>
  static boolean separator_or_eof(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separator_or_eof")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = separator(b, l + 1);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tick expression
  public static boolean signal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal")) return false;
    if (!nextTokenIs(b, TICK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TICK);
    r = r && expression(b, l + 1);
    exit_section_(b, m, SIGNAL, r);
    return r;
  }

  /* ********************************************************** */
  // system_identifier index+
  public static boolean system_fn_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_fn_call")) return false;
    if (!nextTokenIs(b, SYSTEM_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSTEM_IDENTIFIER);
    r = r && system_fn_call_1(b, l + 1);
    exit_section_(b, m, SYSTEM_FN_CALL, r);
    return r;
  }

  // index+
  private static boolean system_fn_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_fn_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!index(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "system_fn_call_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // open_paren index E1* close_paren
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    if (!nextTokenIs(b, OPEN_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && index(b, l + 1);
    r = r && table_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, TABLE, r);
    return r;
  }

  // E1*
  private static boolean table_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!E1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // back_slash expression
  public static boolean trace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trace")) return false;
    if (!nextTokenIs(b, BACK_SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACK_SLASH);
    r = r && expression(b, l + 1);
    exit_section_(b, m, TRACE, r);
    return r;
  }

  /* ********************************************************** */
  // user_assignment
  public static boolean user_assignment_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_assignment_id")) return false;
    if (!nextTokenIs(b, USER_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USER_ASSIGNMENT);
    exit_section_(b, m, USER_ASSIGNMENT_ID, r);
    return r;
  }

  /* ********************************************************** */
  // user_id index+
  public static boolean user_fn_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_fn_call")) return false;
    if (!nextTokenIs(b, USER_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = user_id(b, l + 1);
    r = r && user_fn_call_1(b, l + 1);
    exit_section_(b, m, USER_FN_CALL, r);
    return r;
  }

  // index+
  private static boolean user_fn_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_fn_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!index(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "user_fn_call_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // user_identifier
  public static boolean user_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_id")) return false;
    if (!nextTokenIs(b, USER_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USER_IDENTIFIER);
    exit_section_(b, m, USER_ID, r);
    return r;
  }

  /* ********************************************************** */
  // symbol_vector | number_vector
  static boolean vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector")) return false;
    if (!nextTokenIs(b, "", NUMBER_VECTOR, SYMBOL_VECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL_VECTOR);
    if (!r) r = consumeToken(b, NUMBER_VECTOR);
    exit_section_(b, m, null, r);
    return r;
  }

}
