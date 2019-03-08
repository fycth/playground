package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOf1BitsTest {
  @Test
  public void case1() {
    assertEquals(3, new NumberOf1Bits().hammingWeight(11));
  }
  @Test
  public void case2() {
    assertEquals(1, new NumberOf1Bits().hammingWeight(128));
  }
  @Test
  public void case3() {
    assertEquals(31, new NumberOf1Bits().hammingWeight(-3));
  }
}
