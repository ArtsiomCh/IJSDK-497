package com.github.artsiomch.IJSDK497;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class TestAnnotator implements Annotator {

  @Override
  public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
    if (element.getText().equals("class")) {
      holder
          .createInfoAnnotation(new TextRange(0, 3).shiftRight(element.getTextOffset()), null)
          .setTextAttributes(DefaultLanguageHighlighterColors.NUMBER);
      holder
          .createInfoAnnotation(new TextRange(2, 5).shiftRight(element.getTextOffset()), null)
          .setTextAttributes(DefaultLanguageHighlighterColors.REASSIGNED_PARAMETER);
    }
  }
}
