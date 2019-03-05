package sergiienko.andrii.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {
  @Test
  public void case1() {
    int[] expected = new int[]{1,2,4};
    int[] actual = new PlusOne().plusOne(new int[]{1,2,3});
    int i = 0;
    while (i < expected.length && i < actual.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    int[] expected = new int[]{1,0,0};
    int[] actual = new PlusOne().plusOne(new int[]{9,9});
    int i = 0;
    while (i < expected.length && i < actual.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case3() {
    int[] expected = new int[]{9,8,7,6,5,4,3,2,1,1};
    int[] actual = new PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    int i = 0;
    while (i < expected.length && i < actual.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case4() {
    int[] expected = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7};
    int[] actual = new PlusOne().plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
    int i = 0;
    while (i < expected.length && i < actual.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
