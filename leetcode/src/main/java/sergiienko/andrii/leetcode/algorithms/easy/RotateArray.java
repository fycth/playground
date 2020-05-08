package sergiienko.andrii.leetcode.algorithms.easy;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    for (int j = 0; j < k; j++) {
      int b = nums[nums.length - 1];
      int i;
      for (i = nums.length - 1; i > 0; i--) {
        nums[i] = nums[i - 1];
      }
      nums[i] = b;
    }
  }
}

