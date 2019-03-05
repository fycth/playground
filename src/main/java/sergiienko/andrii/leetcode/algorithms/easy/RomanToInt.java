package sergiienko.andrii.leetcode.algorithms.easy;

public class RomanToInt {
  public int romanToInt(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      int j = i + 1;
      switch (s.charAt(i)) {
        case 'I':
          if (j < s.length() && ((s.charAt(j)) == 'V' || s.charAt(j) == 'X')) {
            res -= 1;
          } else {
            res += 1;
          }
          break;
        case 'V':
          res += 5;
          break;
        case 'X':
          if (j < s.length() && ((s.charAt(j)) == 'L' || s.charAt(j) == 'C')) {
            res -= 10;
          } else {
            res += 10;
          }
          break;
        case 'L':
          res += 50;
          break;
        case 'C':
          if (j < s.length() && ((s.charAt(j)) == 'D' || s.charAt(j) == 'M')) {
            res -= 100;
          } else {
            res += 100;
          }
          break;
        case 'D':
          res += 500;
          break;
        case 'M':
          res += 1000;
          break;
        default:
          res += 0;
          break;
      }
    }
    return res;
  }
}
