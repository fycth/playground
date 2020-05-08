package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {
  @Test
  public void case1() {
    assertEquals(2, new Sqrt().mySqrt(4));
  }
  @Test
  public void case2() {
    assertEquals(2, new Sqrt().mySqrt(8));
  }
}
