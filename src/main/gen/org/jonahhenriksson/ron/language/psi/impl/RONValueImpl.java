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

public class RONValueImpl extends ASTWrapperPsiElement implements RONValue {

  public RONValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RONVisitor visitor) {
    visitor.visitValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RONVisitor) accept((RONVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RONBool getBool() {
    return findChildByClass(RONBool.class);
  }

  @Override
  @Nullable
  public RONList getList() {
    return findChildByClass(RONList.class);
  }

  @Override
  @Nullable
  public RONMap getMap() {
    return findChildByClass(RONMap.class);
  }

  @Override
  @Nullable
  public RONNamedField getNamedField() {
    return findChildByClass(RONNamedField.class);
  }

  @Override
  @Nullable
  public RONObject getObject() {
    return findChildByClass(RONObject.class);
  }

  @Override
  @Nullable
  public RONOption getOption() {
    return findChildByClass(RONOption.class);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

  @Override
  @Nullable
  public PsiElement getFloat() {
    return findChildByType(FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
