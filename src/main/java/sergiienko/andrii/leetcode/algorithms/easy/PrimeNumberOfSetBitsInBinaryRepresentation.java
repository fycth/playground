package sergiienko.andrii.leetcode.algorithms.easy;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
  public int countPrimeSetBits(int L, int R) {
    int res = 0;
    for (int i = L; i <= R; i++) {
      int n = i;
      byte bits = 0;
      for (byte bit = 0; bit < 32; bit++) {
        byte b = (byte) (n & 1);
        if (b == 1) bits++;
        n >>= 1;
      }
      if (isPrime(bits)) res++;
    }
    return res;
  }

  private boolean isPrime(int i) {
    if (i == 1) return false;
    if (i == 2 || i == 3) return true;
    if (i % 2 == 0 || i % 3 == 0) return false;
    int n = 5;
    int k = 2;
    while (n * n <= i) {
      if (i % n == 0) return false;
      n += k;
      k = 6 - k;
    }
    return true;
  }
}
