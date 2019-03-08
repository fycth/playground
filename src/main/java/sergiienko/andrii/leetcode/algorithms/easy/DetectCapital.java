package sergiienko.andrii.leetcode.algorithms.easy;

public class DetectCapital {
  public boolean detectCapitalUse(String word) {
    boolean res = true;
    for (int i = word.length() - 1; i > 0; i--) {
      char ci = word.charAt(i);
      char ci1 = word.charAt(i - 1);
      if (i - 1 == 0 && (ci <= 90 && ci1 >= 97)) return false;
      if (i > 1 && ((ci <= 90 && ci1 >= 97) || ci1 <= 90 && ci >= 97)) return false;
    }
    return res;
  }
}
