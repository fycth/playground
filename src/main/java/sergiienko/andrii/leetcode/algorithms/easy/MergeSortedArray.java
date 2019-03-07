package sergiienko.andrii.leetcode.algorithms.easy;

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i1 = m - 1;
    int i2 = n - 1;
    int i = nums1.length - 1;
    while (i1 >=0 || i2 >= 0) {
      if (i1 < 0) {
        nums1[i] = nums2[i2];
        i2--;
      } else if (i2 < 0) {
        nums1[i] = nums1[i1];
        i1--;
      } else {
        if (nums1[i1] > nums2[i2]) {
          nums1[i] = nums1[i1];
          i1--;
        } else {
          nums1[i] = nums2[i2];
          i2--;
        }
      }
      i--;
    }
  }
}
