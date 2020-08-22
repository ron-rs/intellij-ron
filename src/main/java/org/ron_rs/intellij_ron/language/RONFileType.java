package org.ron_rs.intellij_ron.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RONFileType extends LanguageFileType {
    public static final RONFileType INSTANCE = new RONFileType();

    private RONFileType() {
        super(RONLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "RON file";
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
        return "Rusty Object Notation file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "ron";
    }

    @Override
    public @Nullable Icon getIcon() {
        return RONIcons.FILE;
    }
}
