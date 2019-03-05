package sergiienko.andrii.leetcode.algorithms.easy;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    boolean f = true;
    int k = digits.length - 1;
    while (k >= 0) {
      if (digits[k] != 9) {
        f = false;
        break;
      }
      k--;
    }
    int resLen = digits.length;
    int i = digits.length - 1;
    int j = i;
    if (f) {
      resLen++;
      j++;
    }
    int[] res = new int[resLen];
    short b = 1;
    while (i >= 0) {
      int n = digits[i] + b;
      if (n < 10) {
        b = 0;
        res[j] = n;
      } else {
        res[j] = 10 - n;
        b = 1;
      }
      i--;
      j--;
    }
    if (b != 0) {
      res[j] = b;
    }
    return res;
  }
}
