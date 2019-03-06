package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseVowelsOfAString {
  public String reverseString(String str) {
    char[] s = str.toCharArray();
    int n = 0;
    int m = s.length - 1;
    while (n < m) {
      while (n < m && !isVowel(s[n])) {
        n++;
      }
      while (n < m && !isVowel(s[m])) {
        m--;
      }
      if (isVowel(s[n]) && isVowel(s[m]) && n < m) {
        char c = s[n];
        s[n] = s[m];
        s[m] = c;
      }
      n++;
      m--;
    }
    return new String(s);
  }
  boolean isVowel(char c) {
    switch (c) {
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'u':
      case 'U':
        return true;
      default:
        return false;
    }
  }
}
