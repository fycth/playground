package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.Arrays;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (t.length() != s.length()) return false;
    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    int i = 0;
    while (i < c1.length && i < c2.length) {
      if (c1[i] != c2[i]) return false;
      i++;
    }
    return true;
  }
}
