package sergiienko.andrii.leetcode.algorithms.easy;

public class ReverseBits {
  public int reverseBits(int n) {
    int m = 0;
    for (int i = 31; i >= 0; i--) {
      m |= (n & 0x1);
      if (i > 0) m <<= 1;
      n >>= 1;
    }
    return m;
  }
}
