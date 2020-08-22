package org.ron_rs.intellij_ron.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.ron_rs.intellij_ron.language.psi.RONTypes;

public class RONSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COLON = TextAttributesKey.createTextAttributesKey("RON_COLON", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey("RON_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey("RON_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey("RON_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey("RON_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BOOLEAN = TextAttributesKey.createTextAttributesKey("RON_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("RON_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("RON_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey OPTION = TextAttributesKey.createTextAttributesKey("RON_OPTION", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey EXTENSION = TextAttributesKey.createTextAttributesKey("RON_EXTENSION", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey IDENT = TextAttributesKey.createTextAttributesKey("RON_IDENT", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("RON_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHAR = TextAttributesKey.createTextAttributesKey("RON_BAD_CHAR", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] COLON_KEYS = new TextAttributesKey[]{COLON};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[]{BOOLEAN};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] OPTION_KEYS = new TextAttributesKey[]{OPTION};
    private static final TextAttributesKey[] EXTENSION_KEYS = new TextAttributesKey[]{EXTENSION};
    private static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHAR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new RONLexerAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(RONTypes.COLON)) {
            return COLON_KEYS;
        }
        else if (tokenType.equals(RONTypes.COMMA)) {
            return COMMA_KEYS;
        }
        else if (tokenType.equals(RONTypes.PARENTHESISL) || tokenType.equals(RONTypes.PARENTHESISR)) {
            return PARENTHESES_KEYS;
        }
        else if (tokenType.equals(RONTypes.BRACKETL) || tokenType.equals(RONTypes.BRACKETR)) {
            return BRACKETS_KEYS;
        }
        else if (tokenType.equals(RONTypes.BRACEL) || tokenType.equals(RONTypes.BRACER)) {
            return BRACES_KEYS;
        }
        else if (tokenType.equals(RONTypes.BOOLEAN)) {
            return BOOLEAN_KEYS;
        }
        else if (tokenType.equals(RONTypes.INTEGER)|| tokenType.equals(RONTypes.FLOAT)) {
            return NUMBER_KEYS;
        }
        else if (tokenType.equals(RONTypes.STRING) || tokenType.equals(RONTypes.RAW_STRING)) {
            return STRING_KEYS;
        }
        else if (tokenType.equals(RONTypes.SOME)) {
            return OPTION_KEYS;
        }
        else if (tokenType.equals(RONTypes.EXTENSION)) {
            return EXTENSION_KEYS;
        }
        else if (tokenType.equals(RONTypes.IDENT)) {
            return IDENT_KEYS;
        }
        else if (tokenType.equals(RONTypes.COMMENT) || tokenType.equals(RONTypes.BLOCK_COMMENT)) {
            return COMMENT_KEYS;
        }
        else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        else {
            return EMPTY_KEYS;
        }
    }
}
