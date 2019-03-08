package sergiienko.andrii.leetcode.algorithms.easy;

public class BinarySearch {
  public int search(int[] nums, int target) {
    int right = nums.length - 1;
    int left = 0;
    while (right >= left) {
      int middle = left + (right - left) / 2;
      if (target == nums[middle]) {
        return middle;
      }
      if (target > nums[middle]) {
        left = middle + 1;
      } else if (target < nums[middle]) {
        right = middle - 1;
      }
    }
    return -1;
  }
}
