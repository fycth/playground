package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class DetectCapitalTest {
  @Test
  public void case1() {
    assertTrue(new DetectCapital().detectCapitalUse("USA"));
  }
  @Test
  public void case2() {
    assertFalse(new DetectCapital().detectCapitalUse("FlaG"));
  }
  @Test
  public void case3() {
    assertTrue(new DetectCapital().detectCapitalUse("A"));
  }
  @Test
  public void case4() {
    assertTrue(new DetectCapital().detectCapitalUse("b"));
  }
  @Test
  public void case5() {
    assertTrue(new DetectCapital().detectCapitalUse("Facebook"));
  }
  @Test
  public void case6() {
    assertFalse(new DetectCapital().detectCapitalUse("aB"));
  }
  @Test
  public void case7() {
    assertFalse(new DetectCapital().detectCapitalUse("waHaha"));
  }
  @Test
  public void case8() {
    assertTrue(new DetectCapital().detectCapitalUse("Amazon"));
  }
}
