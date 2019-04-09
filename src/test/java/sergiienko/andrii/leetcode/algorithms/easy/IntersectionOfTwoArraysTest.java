package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoArraysTest {
  @Test
  public void case1() {
    int[] expectedArray = new int[]{2};
    Arrays.sort(expectedArray);
    int[] actualArray = new IntersectionOfTwoArrays().intersection(new int[]{1,2,2,1}, new int[]{2,2});
    Arrays.sort(actualArray);
    assertEquals(expectedArray.length, actualArray.length);
    for (int i = 0; i < expectedArray.length; i++) {
      assertEquals(expectedArray[i], actualArray[i]);
    }
  }

  @Test
  public void case2() {
    int[] expectedArray = new int[]{9,4};
    Arrays.sort(expectedArray);
    int[] actualArray = new IntersectionOfTwoArrays().intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
    Arrays.sort(actualArray);
    assertEquals(expectedArray.length, actualArray.length);
    for (int i = 0; i < expectedArray.length; i++) {
      assertEquals(expectedArray[i], actualArray[i]);
    }
  }
}
