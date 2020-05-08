package sergiienko.andrii.leetcode.algorithms.easy;

public class LicenseKeyFormatting {
  public String licenseKeyFormatting(String S, int K) {
    int l = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = S.length() - 1; i >= 0; i--) {
      if (S.charAt(i) == '-') continue;
      char c = S.charAt(i);
      if (c >= 'a' && c <= 'z') c -= 32;
      if (l == K) {
        sb.append('-');
        l = 0;
      }
      sb.append(c);
      l++;
    }
    return sb.reverse().toString();
  }
}
