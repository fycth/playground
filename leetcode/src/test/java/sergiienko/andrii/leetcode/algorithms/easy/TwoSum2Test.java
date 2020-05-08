package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSum2Test {
  @Test
  public void genericTest() {
    int[] input = new int[]{2, 7, 11, 15};
    int[] expected = new int[]{1, 2};
    int target = 9;

    int[] actual = new TwoSum2().twoSum(input, target);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}