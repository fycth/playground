package sergiienko.andrii.leetcode.algorithms.easy;

public class HammingDistance {
  public int hammingDistance(int x, int y) {
    int length = 0;
    for (int i = 32; i > 0; i--) {
      byte xb = (byte)(x & 1);
      byte yb = (byte)(y & 1);
      if (xb != yb) length++;
      x >>= 1;
      y >>= 1;
    }
    return length;
  }
}
