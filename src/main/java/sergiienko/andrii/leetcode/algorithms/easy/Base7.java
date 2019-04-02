package sergiienko.andrii.leetcode.algorithms.easy;

public class Base7 {
  public String convertToBase7(int num) {
    StringBuilder sb = new StringBuilder();
    int n = num;
    if (num < 0) n = n * (-1);
    while (n >= 7 || n <= -7) {
      int r = n % 7;
      sb.append(r);
      n = n / 7;
    }
    sb.append(n);
    if (num < 0) sb.append("-");
    return sb.reverse().toString();
  }
}
