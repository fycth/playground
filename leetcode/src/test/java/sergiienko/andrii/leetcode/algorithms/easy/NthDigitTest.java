package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthDigitTest {
  @Test
  public void case1() {
    assertEquals(3, new NthDigit().findNthDigit(3));
  }

  @Test
  public void case2() {
    assertEquals(0, new NthDigit().findNthDigit(11));
  }

  @Test
  public void case3() {
    assertEquals(3, new NthDigit().findNthDigit(1000));
  }
}
