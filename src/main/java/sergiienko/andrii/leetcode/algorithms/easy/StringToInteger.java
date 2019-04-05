package sergiienko.andrii.leetcode.algorithms.easy;

public class StringToInteger {
  public int myAtoi(String str) {
    long l = 0;
    boolean neg = false;
    int i;
    for (i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == ' ') continue;
      if (c == '+') {
        i++;
        break;
      }
      if (c == '-') {
        neg = true;
        i++;
        break;
      }
      if (!(c >= '0' && c <= '9')) {
        return 0;
      } else break;
    }
    for (int j = i; j < str.length(); j++) {
      char c = str.charAt(j);
      if (c >= '0' && c <= '9') {
        l *= 10;
        l += (c - 48);
        if (!neg && l > Integer.MAX_VALUE) {
          return Integer.MAX_VALUE;
        } else if (neg && l * -1 < Integer.MIN_VALUE) {
          return Integer.MIN_VALUE;
        }
      } else {
        break;
      }
    }
    if (neg) l *= -1;
    return (int)l;
  }
}
