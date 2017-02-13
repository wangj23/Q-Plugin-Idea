package plugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

import plugin.psi.QTypes;

public class QPairedBraceMatcher implements PairedBraceMatcher {

  private static BracePair[] PAIRS = new BracePair[]{
      new BracePair(QTypes.OPEN_BRACKET, QTypes.CLOSE_BRACKET, true),
      new BracePair(QTypes.OPEN_BRACE, QTypes.CLOSE_BRACE, true),
      new BracePair(QTypes.OPEN_PAREN, QTypes.CLOSE_PAREN, true)
  };

  @Override
  public BracePair[] getPairs() {
    return PAIRS;
  }

  public boolean isPairedBracesAllowedBeforeType(IElementType lbraceType, IElementType contextType) {
    return true;
  }

  @Override
  public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
    return openingBraceOffset;
  }
}
