package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PowerOfTwoTest {
  @Test
  public void case1() {
    assertTrue(new PowerOfTwo().isPowerOfTwo(1));
  }
  @Test
  public void case2() {
    assertFalse(new PowerOfTwo().isPowerOfTwo(0));
  }
  @Test
  public void case3() {
    assertTrue(new PowerOfTwo().isPowerOfTwo(16));
  }
  @Test
  public void case4() {
    assertFalse(new PowerOfTwo().isPowerOfTwo(218));
  }
}
