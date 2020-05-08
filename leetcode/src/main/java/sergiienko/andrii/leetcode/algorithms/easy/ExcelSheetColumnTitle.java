package sergiienko.andrii.leetcode.algorithms.easy;

public class ExcelSheetColumnTitle {
  public String convertToTitle(int n) {
    StringBuilder res = new StringBuilder();
    while (n > 0) {
      int remainder = n % 26;
      if (remainder == 0) {
        res.insert(0, "Z");
        n = ( n / 26) - 1;
      } else {
        res.insert(0, (char)(64 + remainder));
        n = n /26;
      }
    }
    return res.toString();
  }
}
