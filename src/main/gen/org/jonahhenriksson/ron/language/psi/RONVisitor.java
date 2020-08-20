// This is a generated file. Not intended for manual editing.
package org.jonahhenriksson.ron.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class RONVisitor extends PsiElementVisitor {

  public void visitBool(@NotNull RONBool o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull RONList o) {
    visitPsiElement(o);
  }

  public void visitMap(@NotNull RONMap o) {
    visitPsiElement(o);
  }

  public void visitMapEntry(@NotNull RONMapEntry o) {
    visitPsiElement(o);
  }

  public void visitNamedField(@NotNull RONNamedField o) {
    visitPsiElement(o);
  }

  public void visitObject(@NotNull RONObject o) {
    visitPsiElement(o);
  }

  public void visitOption(@NotNull RONOption o) {
    visitPsiElement(o);
  }

  public void visitValue(@NotNull RONValue o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
