package sergiienko.andrii.leetcode.algorithms.easy;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    int i = 0;
    int l = -1;
    for (String s : strs) {
      if (l == -1 || l > s.length()) {
        l = s.length();
      }
    }
    if (l == 0) {
      return "";
    }
    for (int j = 0; j < l; j++) {
      Character c = null;
      for (String s : strs) {
        if (c == null) {
          c = s.charAt(j);
        } else {
          if (!c.equals(s.charAt(j))) {
            return strs[0].substring(0, i);
          }
        }
      }
      i++;
    }
    return strs[0].substring(0, i);
  }
}
