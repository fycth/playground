package sergiienko.andrii.leetcode.algorithms.easy;

public class NthDigit {
  public int findNthDigit(int n) {
    long ln = n;
    long number = 1;
    long l = 1;
    long c = 9;

    while (ln > l * c) {
      ln = ln - l * c;
      l++;
      c = c * 10;
      number = number * 10;
    }

    number = number + (ln - 1) / l;
    String s = String.valueOf(number);

    return s.charAt((int) ((ln - 1) % l)) - '0';
  }
}
