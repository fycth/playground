package sergiienko.andrii.leetcode.algorithms.easy;

public class ExcelSheetColumnNumber {
  public int titleToNumber(String s) {
    int res = 0;
    int pow = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      byte n = (byte)(s.charAt(i) - 64);
      res += n * (Math.pow(26, pow));
      pow++;
    }
    return res;
  }
}
