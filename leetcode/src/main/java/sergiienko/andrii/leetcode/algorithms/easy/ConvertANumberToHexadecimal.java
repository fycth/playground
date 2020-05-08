package sergiienko.andrii.leetcode.algorithms.easy;

public class ConvertANumberToHexadecimal {
  public String toHex(int num) {
    String codes = "0123456789abcdef";
    StringBuilder sb = new StringBuilder(8);
    for (int i = 7; i >= 0; i--) {
      sb.insert(0, codes.charAt(num & 0xf));
      num >>= 4;
    }
    String res = sb.toString();
    int i = 0;
    while (res.charAt(i) == '0' && i < res.length() - 1) {
      i++;
    }
    res = res.substring(i);
    return res;
  }
}
