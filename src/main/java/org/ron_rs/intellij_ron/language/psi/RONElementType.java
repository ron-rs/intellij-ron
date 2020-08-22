package org.ron_rs.intellij_ron.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.ron_rs.intellij_ron.language.RONLanguage;

public class RONElementType extends IElementType {

    public RONElementType(@NotNull @NonNls String debugName) {
        super(debugName, RONLanguage.INSTANCE);
    }
}
