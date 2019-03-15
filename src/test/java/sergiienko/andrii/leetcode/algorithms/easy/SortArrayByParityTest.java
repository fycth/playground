package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortArrayByParityTest {
  @Test
  public void case1() {
    int[] expected = new int[]{2,4,3,1};
    int[] actual = new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4});
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case2() {
    int[] expected = new int[]{2,4};
    int[] actual = new SortArrayByParity().sortArrayByParity(new int[]{2,4});
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case3() {
    int[] expected = new int[]{2,1};
    int[] actual = new SortArrayByParity().sortArrayByParity(new int[]{1,2});
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case4() {
    int[] expected = new int[]{2};
    int[] actual = new SortArrayByParity().sortArrayByParity(new int[]{2});
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case5() {
    int[] expected = new int[]{2,4,3,1};
    int[] actual = new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4});
    assertEquals(expected.length, actual.length);
  }
}
