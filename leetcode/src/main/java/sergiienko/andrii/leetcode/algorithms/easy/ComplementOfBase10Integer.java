package sergiienko.andrii.leetcode.algorithms.easy;

public class ComplementOfBase10Integer {
  public int bitwiseComplement(int N) {
    if (N == 0) return 1;
    int i;
    for (i = 31; i > 0; i--) {
      if ((N >> i & 1) == 1) break;
    }
    i = 32 - ++i;
    return ~N << i >> i;
  }
}
