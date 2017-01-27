// This is a generated file. Not intended for manual editing.
package plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QLambda extends PsiElement {

  @NotNull
  List<QDyad> getDyadList();

  @NotNull
  List<QGlobalAssignment> getGlobalAssignmentList();

  @NotNull
  List<QGroup> getGroupList();

  @NotNull
  List<QIndex> getIndexList();

  @NotNull
  List<QLambda> getLambdaList();

  @NotNull
  List<QList> getListList();

  @NotNull
  List<QLocalAssignment> getLocalAssignmentList();

  @NotNull
  List<QMonad> getMonadList();

  @NotNull
  List<QSignal> getSignalList();

  @NotNull
  List<QSystemFnCall> getSystemFnCallList();

  @NotNull
  List<QTable> getTableList();

  @NotNull
  List<QTrace> getTraceList();

  @NotNull
  List<QUserFnCall> getUserFnCallList();

  @NotNull
  List<QUserId> getUserIdList();

}
