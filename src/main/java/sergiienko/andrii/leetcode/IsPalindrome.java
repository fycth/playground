package sergiienko.andrii.leetcode;

public class IsPalindrome {
  public boolean isPalindrome(int x) {
    long res = 0;
    int l = x;
    while (l != 0) {
      res = (res * 10) + (l % 10);
      l = l / 10;
    }
    return res == Math.abs(x);
  }
}
