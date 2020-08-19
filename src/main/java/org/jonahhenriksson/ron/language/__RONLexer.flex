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
UNSIGNED=(0x[0-9A-Fa-f][0-9A-Fa-f_]*)|((0[bo]?)?[0-9][0-9_]*)
SIGNED=[+-](0x[0-9A-Fa-f][0-9A-Fa-f_]*)|((0[bo]?)?[0-9][0-9_]*)
FLOAT=([+-]?[0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
CHAR='([ -&(-\[\]-~])|(\')|(\\\\)'
STRING=\"([ !#-\[\]-~]|(\\(\"|\\|b|f|n|r|t|(u[A-Fa-f0-9]{4}))))*\"
RAW_STRING=r#\"([\s !#-\[\]-~]|(\\(\"|\\|b|f|n|r|t|(u[A-Fa-f0-9]{4}))))*\"#
OPTION=Some[ \t\n\x0B\f\r]*\([ \t\n\x0B\f\r]*.+[ \t\n\x0B\f\r]*\)
LIST=\[([^,]+(,.+)*,?)?]
MAP=\{[ \t\n\x0B\f\r]*(.+[ \t\n\x0B\f\r]*:[ \t\n\x0B\f\r]*.+[ \t\n\x0B\f\r]*,?)*}
EXTENSION=#!\[enable\([A-Za-z]+\)]

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
  "WS"               { return WS; }

  {COMMENT}          { return COMMENT; }
  {BOOLEAN}          { return BOOLEAN; }
  {IDENT}            { return IDENT; }
  {UNSIGNED}         { return UNSIGNED; }
  {SIGNED}           { return SIGNED; }
  {FLOAT}            { return FLOAT; }
  {CHAR}             { return CHAR; }
  {STRING}           { return STRING; }
  {RAW_STRING}       { return RAW_STRING; }
  {OPTION}           { return OPTION; }
  {LIST}             { return LIST; }
  {MAP}              { return MAP; }
  {EXTENSION}        { return EXTENSION; }

}

[^] { return BAD_CHARACTER; }
