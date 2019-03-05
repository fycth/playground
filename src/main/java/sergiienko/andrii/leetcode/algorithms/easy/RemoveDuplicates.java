package sergiienko.andrii.leetcode.algorithms.easy;

public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int r = 1;
    int l = 0;
    while (r < nums.length) {
      while (nums[r] == nums[l]) {
        r++;
        if (r == nums.length) {
          break;
        }
      }
      if (r == nums.length) {
        break;
      }
      l++;
      nums[l] = nums[r];
      r++;
    }
    return l + 1;
  }
}
