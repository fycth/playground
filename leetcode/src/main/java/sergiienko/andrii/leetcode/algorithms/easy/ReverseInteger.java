package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseInteger {
  public int reverse(int x) {
    long res = 0;
    int l = x;
    while (l != 0) {
      res = (res * 10) + (l % 10);
      if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
        return 0;
      }
      l = l / 10;
    }
    return (int)res;
  }
}
