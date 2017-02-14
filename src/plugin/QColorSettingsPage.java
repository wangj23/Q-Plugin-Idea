package plugin;

import java.util.Map;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.sun.istack.internal.Nullable;

public class QColorSettingsPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
      new AttributesDescriptor("Comments", QSyntaxHighlighter.COMMENT),
      new AttributesDescriptor("Identifiers", QSyntaxHighlighter.IDENTIFIER_ASSIGNMENT),
      new AttributesDescriptor("String", QSyntaxHighlighter.STRING),
      new AttributesDescriptor("Symbols", QSyntaxHighlighter.SYMBOL),
      new AttributesDescriptor("Reserve Words", QSyntaxHighlighter.RESERVE_WORD),
      new AttributesDescriptor("Parens", QSyntaxHighlighter.PARENS)
  };

  @Nullable
  @Override
  public Icon getIcon() {
    return QIcon.FILE;
  }

  @NotNull
  @Override
  public SyntaxHighlighter getHighlighter() {
    return new QSyntaxHighlighter();
  }

  @NotNull
  @Override
  public String getDemoText() {
    return "/// This is a comment line";
  }

  @Nullable
  @Override
  public Map<String,TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @NotNull
  @Override
  public AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @NotNull
  @Override
  public ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "Q";
  }
}
