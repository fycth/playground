package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PowerOfThreeTest {
  @Test
  public void case1() {
    assertTrue(new PowerOfThree().isPowerOfThree(27));
  }
  @Test
  public void case2() {
    assertFalse(new PowerOfThree().isPowerOfThree(0));
  }
  @Test
  public void case3() {
    assertTrue(new PowerOfThree().isPowerOfThree(9));
  }
  @Test
  public void case4() {
    assertFalse(new PowerOfThree().isPowerOfThree(45));
  }
  @Test
  public void case5() {
    assertTrue(new PowerOfThree().isPowerOfThree(243));
  }
  @Test
  public void case6() {
    assertFalse(new PowerOfThree().isPowerOfThree(-3));
  }
  @Test
  public void case7() {
    assertTrue(new PowerOfThree().isPowerOfThree(177147));
  }
}
