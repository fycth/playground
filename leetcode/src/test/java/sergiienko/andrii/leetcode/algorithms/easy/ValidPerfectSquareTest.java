package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidPerfectSquareTest {
  @Test
  public void case1() {
    assertTrue(new ValidPerfectSquare().isPerfectSquare(16));
  }
  @Test
  public void case2() {
    assertFalse(new ValidPerfectSquare().isPerfectSquare(14));
  }
  @Test
  public void case3() {
    assertTrue(new ValidPerfectSquare().isPerfectSquare(9));
  }
  @Test
  public void case4() {
    assertTrue(new ValidPerfectSquare().isPerfectSquare(36));
  }
  @Test
  public void case5() {
    assertFalse(new ValidPerfectSquare().isPerfectSquare(2147483647));
  }
  @Test
  public void case6() {
    assertTrue(new ValidPerfectSquare().isPerfectSquare(1));
  }
  @Test
  public void case7() {
    assertTrue(new ValidPerfectSquare().isPerfectSquare(808201));
  }
}
