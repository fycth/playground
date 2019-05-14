package sergiienko.andrii.leetcode.algorithms.easy;

public class AddDigits {
  public int addDigits(int num) {
    int res = 0;
    if (num > 0) {
      res = (num - 1) % 9 + 1;
    }
    return res;
  }
}
