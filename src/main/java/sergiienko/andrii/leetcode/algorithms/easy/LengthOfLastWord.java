package sergiienko.andrii.leetcode.algorithms.easy;

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int r = s.length();
    int i = s.length() - 1;
    if (s.charAt(i) == ' ') {
      while (i >= 0 && s.charAt(i) == ' ') {
        i--;
      }
      r = i + 1;
    }
    while (i >= 0 && s.charAt(i) != ' ') {
      i--;
    }
    return r - i - 1;
  }
}
