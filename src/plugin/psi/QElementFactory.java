package plugin.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;

import plugin.QFileType;

public class QElementFactory {

  public static QUserId createQUserIds(Project project, String name) {
    final QFile file = createFile(project, name);
    return (QUserId)file.getFirstChild();
  }

  public static QUserAssignmentId createQUserAssignment(Project project, String name) {
    final QFile file = createFile(project, name);
    return (QUserAssignmentId)file.getFirstChild();
  }

  public static PsiElement createCRLF(Project project) {
    final QFile file = createFile(project, "\n");
    return file.getFirstChild();
  }

  public static QFile createFile(Project project, String text) {
    String name = "dummy.q";
    return (QFile)PsiFileFactory.getInstance(project).
        createFileFromText(name, QFileType.INSTANCE, text);
  }
}
