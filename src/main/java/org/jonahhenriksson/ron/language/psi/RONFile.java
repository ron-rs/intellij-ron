package org.jonahhenriksson.ron.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.jonahhenriksson.ron.language.RONFileType;
import org.jonahhenriksson.ron.language.RONLanguage;

public class RONFile extends PsiFileBase {
    public RONFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RONLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return RONFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "RON File";
    }
}
