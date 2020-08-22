package org.ron_rs.intellij_ron.language;

import com.intellij.lexer.FlexAdapter;

public class RONLexerAdapter extends FlexAdapter {
    public RONLexerAdapter() {
        super(new __RONLexer());
    }
}
