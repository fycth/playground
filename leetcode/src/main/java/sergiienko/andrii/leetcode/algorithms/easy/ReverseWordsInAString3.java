package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseWordsInAString3 {
  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int l = 0;
    int n = 0;
    while (l <= chars.length) {
      if (l == chars.length || chars[l] == ' ') {
        int m = l - 1;
        while (n < m) {
          char c = chars[n];
          chars[n] = chars[m];
          chars[m] = c;
          n++;
          m--;
        }
        n = l + 1;
      }
      l++;
    }
    return new String(chars);
  }
}
