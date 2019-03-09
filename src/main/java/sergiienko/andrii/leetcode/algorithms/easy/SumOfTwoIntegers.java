package sergiienko.andrii.leetcode.algorithms.easy;

public class SumOfTwoIntegers {
  public int getSum(int a, int b) {
    int res = 0;
    byte m = 0;
    for (int i = 0; i < 32; i++) {
      byte an = (byte)(a & 0x01);
      byte bn = (byte)(b & 0x01);
      a >>= 1;
      b >>= 1;
      int n = bn + an + m;
      switch (n) {
        case 3:
          n = 1;
          m = 1;
          break;
        case 2:
          n = 0;
          m = 1;
          break;
        default:
          m = 0;
          break;
      }
      if (n == 1) res |= (int)(long)(Math.pow(2, i));
    }
    return res;
  }
}
