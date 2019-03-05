package sergiienko.andrii.leetcode;

public class StrStr {
  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }
    if (haystack.length() >= needle.length()) {
      for (int i = 0; i < haystack.length(); i++) {
        int j = 0;
        while (j < needle.length() && i + j < haystack.length() && haystack.charAt(i + j) == needle.charAt(j)) {
          j++;
        }
        if (j == needle.length()) {
          return i;
        }
      }
    }
    return -1;
  }
}
