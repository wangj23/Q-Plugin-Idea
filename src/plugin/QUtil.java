package plugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;

import plugin.psi.QFile;
import plugin.psi.QLocalAssignment;
import plugin.psi.QUserAssignmentId;
import plugin.psi.QUserId;

public class QUtil {
  public static List<QUserId> findIdentifierQUserId(Project project, String name) {
    List<QUserId> result = null;
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      QFile qFile = (QFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (qFile != null) {
        QLocalAssignment[] localAssignments = PsiTreeUtil.getChildrenOfType(qFile, QLocalAssignment.class);
        if (localAssignments != null) {
          for (QLocalAssignment localAssignment : localAssignments) {
            List<QUserId> qUserIds = localAssignment.getUserIdList();
            for(QUserId qUserId : qUserIds) {
              if (name.equals(qUserId.getName())) {
                if (result == null) {
                  result = new ArrayList<QUserId>();
                }
                result.add(qUserId);
              }
            }
          }
        }
      }
    }
    return result != null ? result : Collections.<QUserId>emptyList();
  }

  public static List<QUserId> findIdentifierQUserId(Project project) {
    List<QUserId> result = new ArrayList<QUserId>();
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      QFile qFile = (QFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (qFile != null) {
        QLocalAssignment[] qLocalAssignments = PsiTreeUtil.getChildrenOfType(qFile, QLocalAssignment.class);
        if(qLocalAssignments == null) {
          continue;
        }
        for(QLocalAssignment qLocalAssignment : qLocalAssignments) {
          if (qLocalAssignment != null) {
            result.addAll(qLocalAssignment.getUserIdList());
          }
        }
      }
    }
    return result;
  }

  public static List<QUserAssignmentId> findIdentifier(Project project, String name) {
    List<QUserAssignmentId> result = null;
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      QFile qFile = (QFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (qFile != null) {
        QLocalAssignment[] localAssignments = PsiTreeUtil.getChildrenOfType(qFile, QLocalAssignment.class);
        if (localAssignments != null) {
          for (QLocalAssignment localAssignment : localAssignments) {
            QUserAssignmentId qUserAssignmentId = localAssignment.getUserAssignmentId();
            if (name.equals(qUserAssignmentId.getText())) {
              if (result == null) {
                result = new ArrayList<QUserAssignmentId>();
              }
              result.add(qUserAssignmentId);
            }
          }
        }
      }
    }
    return result != null ? result : Collections.<QUserAssignmentId>emptyList();
  }

  public static List<QUserAssignmentId> findIdentifier(Project project) {
    List<QUserAssignmentId> result = new ArrayList<QUserAssignmentId>();
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, QFileType.INSTANCE,
            GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      QFile qFile = (QFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (qFile != null) {
        QLocalAssignment[] qLocalAssignments = PsiTreeUtil.getChildrenOfType(qFile, QLocalAssignment.class);
        if(qLocalAssignments == null) {
          continue;
        }
        for(QLocalAssignment qLocalAssignment : qLocalAssignments) {
          if (qLocalAssignment != null) {
            result.add(qLocalAssignment.getUserAssignmentId());
          }
        }
      }
    }
    return result;
  }
}
