package sergiienko.andrii.leetcode.algorithms.easy;

public class MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    int res = 0;
    int n = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        n++;
      } else {
        if (n > res) res = n;
        n = 0;
      }
    }
    if (n > res) res = n;
    return res;
  }
}
