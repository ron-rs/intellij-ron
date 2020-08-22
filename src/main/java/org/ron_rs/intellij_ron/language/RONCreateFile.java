package org.ron_rs.intellij_ron.language;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NotNull;

public class RONCreateFile extends CreateFileFromTemplateAction {

    private static final String NAME = "RON File";

    public RONCreateFile() {
        super(NAME, "Create new RON file", RONIcons.FILE);
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder.setTitle(NAME).addKind("Empty file", RONIcons.FILE, "RON File");
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NotNull String newName, String templateName) {
        return NAME;
    }
}
