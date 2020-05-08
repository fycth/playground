package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class BinaryNumberWithAlternatingBitsTest {
  @Test
  public void case1() {
    assertTrue(new BinaryNumberWithAlternatingBits().hasAlternatingBits(5));
  }

  @Test
  public void case2() {
    assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(7));
  }

  @Test
  public void case3() {
    assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(11));
  }

  @Test
  public void case4() {
    assertTrue(new BinaryNumberWithAlternatingBits().hasAlternatingBits(10));
  }

  @Test
  public void case5() {
    assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(0));
  }
}
