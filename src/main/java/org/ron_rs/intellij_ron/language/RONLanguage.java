package org.ron_rs.intellij_ron.language;

import com.intellij.lang.Language;

public class RONLanguage extends Language {
    public static final RONLanguage INSTANCE = new RONLanguage();

    private RONLanguage() {
        super("RON");
    }
}
