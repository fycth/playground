package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortedArrayTest {
  @Test
  public void case1() {
    int[] nums1 = new int[]{1,2,3,0,0,0};
    int[] nums2 = new int[]{2,5,6};
    int[] expected = new int[]{1,2,2,3,5,6};
    new MergeSortedArray().merge(nums1, 3, nums2, 3);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], nums1[i]);
    }
  }
}
