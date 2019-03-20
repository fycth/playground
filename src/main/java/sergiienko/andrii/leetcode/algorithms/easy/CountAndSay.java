package sergiienko.andrii.leetcode.algorithms.easy;

public class CountAndSay {
  public String countAndSay(int n) {
    String s = "1";
    for (int i = 1; i < n; i++) {
      StringBuilder t = new StringBuilder();
      int j = 0;
      while (j < s.length()) {
        int m = s.charAt(j) - 48;
        int c = 0;
        while (m == s.charAt(j) - 48) {
          c++;
          j++;
          if (j == s.length()) break;
        }
        t.append(c).append(m);
      }
      s = t.toString();
    }
    return s;
  }
}
