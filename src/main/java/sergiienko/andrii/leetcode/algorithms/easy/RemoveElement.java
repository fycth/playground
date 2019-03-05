package sergiienko.andrii.leetcode.algorithms.easy;

public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    int r = 0;
    int l = 0;
    while (r < nums.length) {
      while (r < nums.length && nums[r] != val) {
        nums[l] = nums[r];
        l++;
        r++;
      }
      r++;
    }
    return l;
  }
}
