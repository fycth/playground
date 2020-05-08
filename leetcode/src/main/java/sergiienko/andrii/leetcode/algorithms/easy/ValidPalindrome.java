package sergiienko.andrii.leetcode.algorithms.easy;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    boolean res = true;
    int i = 0;
    int j = s.length() - 1;
    while (i < s.length() - 1 && j >= 0) {
      while (i < s.length() - 1 && !validChar(s.charAt(i))) {
        i++;
      }
      if (i == s.length()) {
        return res;
      }
      char ci = (char) (s.charAt(i) & 0x5f);

      while (j > -1 && !validChar(s.charAt(j))) {
        j--;
      }
      if (j == -1) {
        return res;
      }
      char cj = (char) (s.charAt(j) & 0x5f);

      if (ci != cj) {
        res = false;
      }

      i++;
      j--;
    }
    return res;
  }

  private boolean validChar(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
  }
}
