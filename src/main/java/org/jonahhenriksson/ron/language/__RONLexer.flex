package org.jonahhenriksson.ron.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.jonahhenriksson.ron.language.psi.RONTypes.*;

%%

%{
  public __RONLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class __RONLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT="//".*
BOOLEAN=true|false
IDENT=[A-Za-z_]+
INTEGER=[+-]?((0x[0-9A-Fa-f][0-9A-Fa-f_]*)|((0[bo]?)?[0-9][0-9_]*))
FLOAT=([+-]?[0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
CHAR='([ -&(-\[\]-~])|(\')|(\\\\)'
STRING=\"([^\r\n\"]|(\\[^ ]))*\"
RAW_STRING=r#\"([^\"]|(\\[^ ]))*\"#
EXTENSION=#!\[enable\([A-Za-z_]+\)\]

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "("                { return PARENTHESISL; }
  ")"                { return PARENTHESISR; }
  "["                { return BRACKETL; }
  "]"                { return BRACKETR; }
  "{"                { return BRACEL; }
  "}"                { return BRACER; }
  ":"                { return COLON; }
  ","                { return COMMA; }
  "Some"             { return SOME; }

  {COMMENT}          { return COMMENT; }
  {BOOLEAN}          { return BOOLEAN; }
  {IDENT}            { return IDENT; }
  {INTEGER}          { return INTEGER; }
  {FLOAT}            { return FLOAT; }
  {CHAR}             { return CHAR; }
  {STRING}           { return STRING; }
  {RAW_STRING}       { return RAW_STRING; }
  {EXTENSION}        { return EXTENSION; }

}

[^] { return BAD_CHARACTER; }
