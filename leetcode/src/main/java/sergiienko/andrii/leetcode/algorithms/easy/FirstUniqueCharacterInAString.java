package sergiienko.andrii.leetcode.algorithms.easy;

public class FirstUniqueCharacterInAString {
  public int firstUniqChar(String s) {
    if (s.length() == 1) return 0;
    if (!s.isEmpty()) {
      int[] m = new int[26];
      char[] c = s.toCharArray();
      for (int i = 0; i < c.length; i++) m[c[i] - 97]++;
      for (int i = 0; i < c.length; i++) {
        if (m[c[i] - 97] == 1) return i;
      }
    }
    return -1;
  }
}
