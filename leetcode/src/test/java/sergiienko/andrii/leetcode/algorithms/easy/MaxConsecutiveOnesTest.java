package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {
  @Test
  public void case1() {
    assertEquals(3, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
  }
}
