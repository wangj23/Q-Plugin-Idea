package plugin.psi.impl;

import javax.swing.Icon;

import org.jetbrains.annotations.Nullable;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;

import plugin.QIcon;
import plugin.psi.QElementFactory;
import plugin.psi.QTypes;
import plugin.psi.QUserId;

public class QPsiImplUtil {

  public static String getUserIdentifier(QUserId element) {
    ASTNode keyNode = element.getNode().findChildByType(QTypes.USER_IDENTIFIER);
    if (keyNode != null) {
      return keyNode.getText();
    } else {
      return null;
    }
  }

  public static String getName(QUserId element) {
    return getUserIdentifier(element);
  }

  public static PsiElement setName(QUserId element, String newName) {
    final ASTNode keyNode = element.getNode().findChildByType(QTypes.USER_IDENTIFIER);
    if (keyNode != null) {
      QUserId property = QElementFactory.createProperty(element.getProject(), newName);
      ASTNode newKeyNode = property.getFirstChild().getNode();
      element.getNode().replaceChild(keyNode, newKeyNode);
    }
    return element;
  }

  public static PsiElement getNameIdentifier(QUserId element) {
    final ASTNode keyNode = element.getNode().findChildByType(QTypes.USER_IDENTIFIER);
    if (keyNode != null) {
      return keyNode.getPsi();
    } else {
      return null;
    }
  }

  public static ItemPresentation getPresentation(final QUserId element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return getUserIdentifier(element);
      }

      @Nullable
      @Override
      public String getLocationString() {
        final PsiFile containingFile = element.getContainingFile();
        return containingFile == null ? "" : containingFile.getName();
      }

      @Nullable
      @Override
      public Icon getIcon(boolean unused) {
        return QIcon.FILE;
      }
    };
  }
}
