package plugin;

import org.jetbrains.annotations.Nullable;

import com.intellij.lang.Commenter;

public class QCommenter implements Commenter {
  @Nullable
  @Override
  public String getLineCommentPrefix() {
    return "/";
  }

  @Nullable
  @Override
  public String getBlockCommentPrefix() {
    return "/";
  }

  @Nullable
  @Override
  public String getBlockCommentSuffix() {
    return null;
  }

  @Nullable
  @Override
  public String getCommentedBlockCommentPrefix() {
    return null;
  }

  @Nullable
  @Override
  public String getCommentedBlockCommentSuffix() {
    return null;
  }
}
