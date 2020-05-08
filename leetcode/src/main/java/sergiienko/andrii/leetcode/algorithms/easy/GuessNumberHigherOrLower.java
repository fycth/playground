package sergiienko.andrii.leetcode.algorithms.easy;

public class GuessNumberHigherOrLower {
  public int guessNumber(int n) {
    int left = 1;
    int right = n;
    int middle = 0;
    while (right >= left) {
      middle = left + (right - left) / 2;
      if (guess(middle) == 0) {
        return middle;
      }
      if (guess(middle) > 0) {
        left = middle + 1;
      } else if (guess(middle) < 0) {
        right = middle - 1;
      }
    }
    return middle;
  }

  private int guess(int i) {
    if (i == 6) {
      return 0;
    } else if (6 > i) {
      return 1;
    } else {
      return -1;
    }
  }
}
