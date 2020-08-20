// This is a generated file. Not intended for manual editing.
package org.jonahhenriksson.ron.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.jonahhenriksson.ron.language.psi.impl.*;

public interface RONTypes {

  IElementType BOOL = new RONElementType("BOOL");
  IElementType LIST = new RONElementType("LIST");
  IElementType MAP = new RONElementType("MAP");
  IElementType MAP_ENTRY = new RONElementType("MAP_ENTRY");
  IElementType NAMED_FIELD = new RONElementType("NAMED_FIELD");
  IElementType OBJECT = new RONElementType("OBJECT");
  IElementType OPTION = new RONElementType("OPTION");
  IElementType VALUE = new RONElementType("VALUE");

  IElementType BOOLEAN = new RONTokenType("BOOLEAN");
  IElementType BRACEL = new RONTokenType("{");
  IElementType BRACER = new RONTokenType("}");
  IElementType BRACKETL = new RONTokenType("[");
  IElementType BRACKETR = new RONTokenType("]");
  IElementType CHAR = new RONTokenType("CHAR");
  IElementType COLON = new RONTokenType(":");
  IElementType COMMA = new RONTokenType(",");
  IElementType COMMENT = new RONTokenType("COMMENT");
  IElementType EXTENSION = new RONTokenType("EXTENSION");
  IElementType FLOAT = new RONTokenType("FLOAT");
  IElementType IDENT = new RONTokenType("IDENT");
  IElementType INTEGER = new RONTokenType("INTEGER");
  IElementType PARENTHESISL = new RONTokenType("(");
  IElementType PARENTHESISR = new RONTokenType(")");
  IElementType RAW_STRING = new RONTokenType("RAW_STRING");
  IElementType SOME = new RONTokenType("Some");
  IElementType STRING = new RONTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BOOL) {
        return new RONBoolImpl(node);
      }
      else if (type == LIST) {
        return new RONListImpl(node);
      }
      else if (type == MAP) {
        return new RONMapImpl(node);
      }
      else if (type == MAP_ENTRY) {
        return new RONMapEntryImpl(node);
      }
      else if (type == NAMED_FIELD) {
        return new RONNamedFieldImpl(node);
      }
      else if (type == OBJECT) {
        return new RONObjectImpl(node);
      }
      else if (type == OPTION) {
        return new RONOptionImpl(node);
      }
      else if (type == VALUE) {
        return new RONValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
