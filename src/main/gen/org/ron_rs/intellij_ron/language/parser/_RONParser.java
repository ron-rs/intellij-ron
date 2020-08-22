// This is a generated file. Not intended for manual editing.
package org.ron_rs.intellij_ron.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.ron_rs.intellij_ron.language.psi.RONTypes.*;
import static org.ron_rs.intellij_ron.language.psi.RONParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class _RONParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return RON(b, l + 1);
  }

  /* ********************************************************** */
  // [extension+] value
  static boolean RON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RON_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [extension+]
  private static boolean RON_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON_0")) return false;
    RON_0_0(b, l + 1);
    return true;
  }

  // extension+
  private static boolean RON_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RON_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extension(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!extension(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RON_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BOOLEAN
  public static boolean bool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool")) return false;
    if (!nextTokenIs(b, BOOLEAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOOLEAN);
    exit_section_(b, m, BOOL, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR
  static boolean char_$(PsiBuilder b, int l) {
    return consumeToken(b, CHAR);
  }

  /* ********************************************************** */
  // EXTENSION
  static boolean extension(PsiBuilder b, int l) {
    return consumeToken(b, EXTENSION);
  }

  /* ********************************************************** */
  // FLOAT
  static boolean float_$(PsiBuilder b, int l) {
    return consumeToken(b, FLOAT);
  }

  /* ********************************************************** */
  // INTEGER
  static boolean integer(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER);
  }

  /* ********************************************************** */
  // BRACKETL [value (COMMA value)* [COMMA]] BRACKETR
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, BRACKETL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKETL);
    r = r && list_1(b, l + 1);
    r = r && consumeToken(b, BRACKETR);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // [value (COMMA value)* [COMMA]]
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    list_1_0(b, l + 1);
    return true;
  }

  // value (COMMA value)* [COMMA]
  private static boolean list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && list_1_0_1(b, l + 1);
    r = r && list_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA value
  private static boolean list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean list_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // BRACEL [map_entry (COMMA map_entry)*  [COMMA]] BRACER
  public static boolean map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map")) return false;
    if (!nextTokenIs(b, BRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACEL);
    r = r && map_1(b, l + 1);
    r = r && consumeToken(b, BRACER);
    exit_section_(b, m, MAP, r);
    return r;
  }

  // [map_entry (COMMA map_entry)*  [COMMA]]
  private static boolean map_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1")) return false;
    map_1_0(b, l + 1);
    return true;
  }

  // map_entry (COMMA map_entry)*  [COMMA]
  private static boolean map_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_entry(b, l + 1);
    r = r && map_1_0_1(b, l + 1);
    r = r && map_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA map_entry)*
  private static boolean map_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!map_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA map_entry
  private static boolean map_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && map_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean map_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // value COLON value
  public static boolean map_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_ENTRY, "<map entry>");
    r = value(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT COLON value
  public static boolean named_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_field")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, NAMED_FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // [IDENT] PARENTHESISL [value (COMMA value)* [COMMA]] PARENTHESISR | PARENTHESISL PARENTHESISR | IDENT
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, "<object>", IDENT, PARENTHESISL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    r = object_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, PARENTHESISL, PARENTHESISR);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [IDENT] PARENTHESISL [value (COMMA value)* [COMMA]] PARENTHESISR
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_0_0(b, l + 1);
    r = r && consumeToken(b, PARENTHESISL);
    r = r && object_0_2(b, l + 1);
    r = r && consumeToken(b, PARENTHESISR);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IDENT]
  private static boolean object_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_0")) return false;
    consumeToken(b, IDENT);
    return true;
  }

  // [value (COMMA value)* [COMMA]]
  private static boolean object_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_2")) return false;
    object_0_2_0(b, l + 1);
    return true;
  }

  // value (COMMA value)* [COMMA]
  private static boolean object_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && object_0_2_0_1(b, l + 1);
    r = r && object_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean object_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_0_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA value
  private static boolean object_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean object_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // SOME PARENTHESISL value PARENTHESISR
  public static boolean option(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "option")) return false;
    if (!nextTokenIs(b, SOME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SOME, PARENTHESISL);
    r = r && value(b, l + 1);
    r = r && consumeToken(b, PARENTHESISR);
    exit_section_(b, m, OPTION, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | RAW_STRING
  static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "", RAW_STRING, STRING)) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, RAW_STRING);
    return r;
  }

  /* ********************************************************** */
  // bool | integer | float | string | char | option | list | map | named_field | object
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = bool(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = float_$(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = char_$(b, l + 1);
    if (!r) r = option(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = map(b, l + 1);
    if (!r) r = named_field(b, l + 1);
    if (!r) r = object(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
