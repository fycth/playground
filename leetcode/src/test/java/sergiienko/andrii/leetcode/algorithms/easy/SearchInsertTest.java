package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertTest {
  @Test
  public void case1() {
    assertEquals(2, new SearchInsert().searchInsert(new int[]{1,3,5,6}, 5));
  }
  @Test
  public void case2() {
    assertEquals(1, new SearchInsert().searchInsert(new int[]{1,3,5,6}, 2));
  }
  @Test
  public void case3() {
    assertEquals(4, new SearchInsert().searchInsert(new int[]{1,3,5,6}, 7));
  }
  @Test
  public void case4() {
    assertEquals(0, new SearchInsert().searchInsert(new int[]{1,3,5,6}, 0));
  }
  @Test
  public void case5() {
    assertEquals(0, new SearchInsert().searchInsert(new int[]{}, 1));
  }
}
