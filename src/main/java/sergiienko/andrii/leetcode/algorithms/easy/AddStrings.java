package sergiienko.andrii.leetcode.algorithms.easy;

public class AddStrings {
  public String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int i1 = num1.length() - 1;
    int i2 = num2.length() - 1;
    int b = 0;
    while (true) {
      int n1 = 0;
      int n2 = 0;
      if (i1 >= 0) {
        n1 = num1.charAt(i1) - 48;
        i1--;
      }
      if (i2 >= 0) {
        n2 = num2.charAt(i2) - 48;
        i2--;
      }
      int n = n1 + n2 + b;
      b = n / 10;
      n = n % 10;
      sb.insert(0, n);
      if (i1 < 0 && i2 < 0) {
        if (b > 0) sb.insert(0, b);
        break;
      }
    }
    return sb.toString();
  }
}
