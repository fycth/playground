package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
  @Test
  public void case1() {
    assertEquals(4, new BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9));
  }
  @Test
  public void case2() {
    assertEquals(-1, new BinarySearch().search(new int[]{-1,0,3,5,9,12}, 2));
  }
}
