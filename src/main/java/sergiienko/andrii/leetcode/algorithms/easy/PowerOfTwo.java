package sergiienko.andrii.leetcode.algorithms.easy;

public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    if (n <=0 ) {
      return false;
    }
    return n == Math.pow(2, Math.round(Math.log(n)/Math.log(2)));
  }
}
