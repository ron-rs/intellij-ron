package org.jonahhenriksson.ron.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class RONLexerAdapter extends FlexAdapter {
    public RONLexerAdapter() {
        super(new __RONLexer());
    }
}
