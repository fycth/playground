package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class UglyNumberTest {
  @Test
  public void case1() {
    assertTrue(new UglyNumber().isUgly(6));
  }

  @Test
  public void case2() {
    assertTrue(new UglyNumber().isUgly(8));
  }

  @Test
  public void case3() {
    assertFalse(new UglyNumber().isUgly(14));
  }

  @Test
  public void case4() {
    assertTrue(new UglyNumber().isUgly(9));
  }

  @Test
  public void case5() {
    assertFalse(new UglyNumber().isUgly(7));
  }
}
