package sergiienko.andrii.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoSumTest {
  @Test
  public void genericTest() {
    int[] input = new int[]{2, 7, 11, 15};
    int[] expected = new int[]{0, 1};
    int target = 9;

    int[] actual = new TwoSum().twoSum(input, target);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}