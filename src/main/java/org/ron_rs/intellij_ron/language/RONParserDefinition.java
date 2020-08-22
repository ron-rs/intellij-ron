package org.ron_rs.intellij_ron.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.ron_rs.intellij_ron.language.parser._RONParser;
import org.ron_rs.intellij_ron.language.psi.RONTypes;
import org.ron_rs.intellij_ron.language.psi.RONFile;

public class RONParserDefinition implements ParserDefinition {
    public static final TokenSet COMMENTS = TokenSet.create(RONTypes.COMMENT, RONTypes.BLOCK_COMMENT);
    public static final TokenSet STRING_LITERALS = TokenSet.create(RONTypes.STRING);

    public static final IFileElementType FILE = new IFileElementType(RONLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new RONLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new _RONParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return STRING_LITERALS;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return RONTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new RONFile(viewProvider);
    }

    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
