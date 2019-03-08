package sergiienko.andrii.leetcode.algorithms.easy;

public class NumberOf1Bits {
  public int hammingWeight(int n) {
    int res = 0;
    for (short i = 31; i >= 0; i--) {
      byte b = (byte)(n & 0x01);
      if (b == 1) res++;
      n >>= 1;
    }
    return res;
  }
}
