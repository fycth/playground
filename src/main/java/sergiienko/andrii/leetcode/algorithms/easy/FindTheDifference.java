package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.Arrays;

public class FindTheDifference {
  public char findTheDifference(String s, String t) {
    char[] sc = s.toCharArray();
    char[] st = t.toCharArray();
    Arrays.sort(sc);
    Arrays.sort(st);
    int i = 0;
    while (i < st.length) {
      if (i == sc.length || sc[i] != st[i]) {
        return st[i];
      }
      i++;
    }
    return '0';
  }
}
