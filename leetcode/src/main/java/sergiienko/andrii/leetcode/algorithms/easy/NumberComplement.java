package sergiienko.andrii.leetcode.algorithms.easy;

public class NumberComplement {
  public int findComplement(int num) {
    if (num == 0) return 1;
    int i;
    for (i = 31; i > 0; i--) {
      if ((num >> i & 1) == 1) break;
    }
    i = 32 - ++i;
    return ~num << i >> i;
  }
}
