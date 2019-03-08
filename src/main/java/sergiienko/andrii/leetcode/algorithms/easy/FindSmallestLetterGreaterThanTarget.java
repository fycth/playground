package sergiienko.andrii.leetcode.algorithms.easy;

public class FindSmallestLetterGreaterThanTarget {
  public char nextGreatestLetter(char[] letters, char target) {
    int i = 0;
    while (i < letters.length && target >= letters[i]) i++;
    if (i == letters.length) return letters[0];
    return letters[i];
  }
}
