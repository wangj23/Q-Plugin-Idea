package plugin;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.util.ProcessingContext;

public class QReferenceContributor extends PsiReferenceContributor {
  @Override
  public void registerReferenceProviders(
      @NotNull
          PsiReferenceRegistrar registrar) {
    registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression.class),
        new PsiReferenceProvider() {
          @NotNull
          @Override
          public PsiReference[] getReferencesByElement(
              @NotNull
                  PsiElement element,
              @NotNull
                  ProcessingContext context) {
            PsiLiteralExpression literalExpression = (PsiLiteralExpression)element;
            String value = literalExpression.getValue() instanceof String ?
                (String)literalExpression.getValue() :
                null;
            if (value != null && value.startsWith("simple" + ":")) {
              return new PsiReference[] {new QReference(element, new TextRange(8, value.length() + 1))};
            }
            return PsiReference.EMPTY_ARRAY;
          }
        });
  }
}
