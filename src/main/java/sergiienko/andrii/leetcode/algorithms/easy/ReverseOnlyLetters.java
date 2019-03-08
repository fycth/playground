package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseOnlyLetters {
  public String reverseOnlyLetters(String S) {
    char[] s = S.toCharArray();
    char[] res = new char[s.length];
    System.arraycopy(s, 0, res, 0, s.length);
    int n = 0;
    int m = s.length - 1;
    while (n < m) {
      if (!((s[n] >= 65 && s[n] <= 90) || (s[n] >= 97 && s[n] <= 122))) {
        res[n] = s[n];
        n++;
        continue;
      }
      if (!((s[m] >= 65 && s[m] <= 90) || (s[m] >= 97 && s[m] <= 122))) {
        res[m] = s[m];
        m--;
        continue;
      }
      res[n] = s[m];
      res[m] = s[n];
      n++;
      m--;
    }
    return new String(res);
  }
}
