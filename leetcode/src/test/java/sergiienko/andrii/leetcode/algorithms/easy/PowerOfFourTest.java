package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PowerOfFourTest {
  @Test
  public void case1() {
    assertTrue(new PowerOfFour().isPowerOfFour(16));
  }
  @Test
  public void case2() {
    assertFalse(new PowerOfFour().isPowerOfFour(0));
  }
  @Test
  public void case4() {
    assertFalse(new PowerOfFour().isPowerOfFour(5));
  }
}
