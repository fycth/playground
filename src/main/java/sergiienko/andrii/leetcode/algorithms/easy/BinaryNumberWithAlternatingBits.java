package sergiienko.andrii.leetcode.algorithms.easy;

public class BinaryNumberWithAlternatingBits {
  public boolean hasAlternatingBits(int n) {
    int m = n;
    byte lastBit = 0;
    for (byte i = 0; i < 32; i++) {
      byte b = (byte)(m & 1);
      if (b == 1) lastBit = i;
      m >>= 1;
    }

    byte b1 = (byte)(n & 1);
    m = n >> 1;
    for (byte i = 0; i <= lastBit; i++) {
      byte b = (byte)(m & 1);
      if (b == b1) return false;
      m >>= 1;
      b1 = b;
    }
    return true;
  }
}
