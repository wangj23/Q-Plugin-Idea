package plugin;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class QFileTypeFactory extends FileTypeFactory {
  @Override
  public void createFileTypes(
      @NotNull FileTypeConsumer fileTypeConsumer) {
    fileTypeConsumer.consume(QFileType.INSTANCE, "q");
  }
}
