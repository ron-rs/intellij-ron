// This is a generated file. Not intended for manual editing.
package org.jonahhenriksson.ron.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.ron_rs.intellij_ron.language.psi.RONTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jonahhenriksson.ron.language.psi.*;

public class RONMapEntryImpl extends ASTWrapperPsiElement implements RONMapEntry {

  public RONMapEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitMapEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RONValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RONValue.class);
  }

}
