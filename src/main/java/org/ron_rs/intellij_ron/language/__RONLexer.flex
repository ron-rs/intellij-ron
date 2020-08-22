package org.jonahhenriksson.ron.language;

import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

%%

%{
  public __RONLexer() {
    this((java.io.Reader)null);
  }
%}

%{
  private int zzShaStride = -1;

  private int zzPostponedMarkedPos = -1;
%}

%{
  IElementType imbueRawLiteral() {
    yybegin(YYINITIAL);

    zzStartRead = zzPostponedMarkedPos;
    zzShaStride = -1;
    zzPostponedMarkedPos = -1;

    return RAW_STRING;
  }

  IElementType imbueBlockComment() {
    yybegin(YYINITIAL);

    zzStartRead = zzPostponedMarkedPos;
    zzPostponedMarkedPos = -1;

    return BLOCK_COMMENT;
  }
%}

%public
%class __RONLexer
%implements FlexLexer
%function advance
%type IElementType

%s IN_RAW_STRING
%s IN_RAW_STRING_SUFFIX

%s IN_BLOCK_COMMENT

%unicode

EOL=\R
WHITE_SPACE=\s+

BOOLEAN=true|false
IDENT=[A-Za-z_]+
INTEGER=[+-]?((0x[0-9A-Fa-f][0-9A-Fa-f_]*)|((0[bo]?)?[0-9][0-9_]*))
FLOAT=([+-]?[0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
CHAR='([ -&(-\[\]-~])|(\')|(\\\\)'
STRING=\"([^\r\n\"]|(\\[\S]))*\"
EXTENSION=#!\[enable\([A-Za-z_]+\)\]
COMMENT="//".*

%%
<YYINITIAL> {
  "("                { return PARENTHESISL; }
  ")"                { return PARENTHESISR; }
  "["                { return BRACKETL; }
  "]"                { return BRACKETR; }
  "{"                { return BRACEL; }
  "}"                { return BRACER; }
  ":"                { return COLON; }
  ","                { return COMMA; }
  "Some"             { return SOME; }

  "r" #* \"          {
                        yybegin(IN_RAW_STRING);
                        zzPostponedMarkedPos = zzStartRead;
                        zzShaStride = yylength() - 2;
                     }

  {BOOLEAN}          { return BOOLEAN; }
  {IDENT}            { return IDENT; }
  {INTEGER}          { return INTEGER; }
  {FLOAT}            { return FLOAT; }
  {CHAR}             { return CHAR; }
  {STRING}           { return STRING; }
  {EXTENSION}        { return EXTENSION; }
  {COMMENT}          { return COMMENT; }
  "/*"               {
                       yybegin(IN_BLOCK_COMMENT);
                       yypushback(2);
                     }

  {WHITE_SPACE}      { return WHITE_SPACE; }
}

<IN_RAW_STRING> {
  \" #* { int shaExcess = yylength() - 1 - zzShaStride; if (shaExcess >= 0) { yybegin(IN_RAW_STRING_SUFFIX); yypushback(shaExcess); } }
  [^]       { }
  <<EOF>>   { return imbueRawLiteral(); }
}

<IN_RAW_STRING_SUFFIX> {
  [^]       { yypushback(1); return imbueRawLiteral(); }
  <<EOF>>   { return imbueRawLiteral(); }
}

<IN_BLOCK_COMMENT> {
  "*/"      { return imbueBlockComment(); }
  <<EOF>>   { return imbueBlockComment(); }
  [^]       { }
}

[^] { return BAD_CHARACTER; }
