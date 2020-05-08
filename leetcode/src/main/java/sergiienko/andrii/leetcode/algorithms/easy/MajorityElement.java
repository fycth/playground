package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.Arrays;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int j = nums.length / 2;
    while (i < nums.length) {
      int n = nums[i];
      if (n == nums[j]) return n;
      while (i < nums.length && nums[i] == n) i++;
    }
    return -1;
  }
}
