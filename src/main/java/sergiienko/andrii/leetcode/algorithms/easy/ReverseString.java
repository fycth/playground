package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseString {
  public void reverseString(char[] s) {
    int n = 0;
    int m = s.length - 1;
    while (n < m) {
      char c = s[n];
      s[n] = s[m];
      s[m] = c;
      n++;
      m--;
    }
  }
}
