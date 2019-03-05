package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateArrayTest {
  @Test
  public void case1() {
    int[] initial = new int[]{1,2,3,4,5,6,7};
    int[] expected = new int[]{5,6,7,1,2,3,4};
    int[] actual = new int[initial.length];
    System.arraycopy(initial, 0, actual, 0, actual.length);
    new RotateArray().rotate(actual, 3);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
