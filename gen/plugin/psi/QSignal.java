// This is a generated file. Not intended for manual editing.
package plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QSignal extends PsiElement {

  @NotNull
  List<QDyad> getDyadList();

  @Nullable
  QGlobalAssignment getGlobalAssignment();

  @NotNull
  List<QGroup> getGroupList();

  @NotNull
  List<QIndex> getIndexList();

  @NotNull
  List<QLambda> getLambdaList();

  @NotNull
  List<QList> getListList();

  @Nullable
  QLocalAssignment getLocalAssignment();

  @NotNull
  List<QMonad> getMonadList();

  @Nullable
  QSignal getSignal();

  @NotNull
  List<QSystemFnCall> getSystemFnCallList();

  @NotNull
  List<QTable> getTableList();

  @Nullable
  QTrace getTrace();

  @NotNull
  List<QUserFnCall> getUserFnCallList();

  @NotNull
  List<QUserId> getUserIdList();

}
