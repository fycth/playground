package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveZeroesTest {
  @Test
  public void case1() {
    int[] input = new int[]{0,1,0,3,12};
    int[] actual = new int[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new MoveZeroes().moveZeroes(actual);
    int[] expected = new int[]{1,3,12,0,0};
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
