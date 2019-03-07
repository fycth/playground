package sergiienko.andrii.leetcode.algorithms.easy;

public class ValidPerfectSquare {
  public boolean isPerfectSquare(int num) {
    long i = num == 1 ? 1 : num / 2;
    while (i * i > num) {
      i--;
    }
    return i * i == num;
  }
}
