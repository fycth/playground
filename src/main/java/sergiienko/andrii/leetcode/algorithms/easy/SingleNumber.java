package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.Arrays;

public class SingleNumber {
  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    int c = 0;
    int n = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == n) {
        c++;
      } else {
        if (c == 1) return n;
        c = 1;
        n = nums[i];
      }
    }
    return n;
  }
}
