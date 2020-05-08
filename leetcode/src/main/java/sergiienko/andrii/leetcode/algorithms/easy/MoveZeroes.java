package sergiienko.andrii.leetcode.algorithms.easy;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int i = 0;
    while (i < nums.length && nums[i] != 0) i++;
    int j = i + 1;
    while (j < nums.length) {
      if (nums[j] != 0) {
        nums[i] = nums[j];
        i++;
      }
      j++;
    }
    while (i < nums.length) {
      nums[i] = 0;
      i++;
    }
  }
}
