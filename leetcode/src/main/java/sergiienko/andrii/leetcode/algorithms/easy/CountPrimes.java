package sergiienko.andrii.leetcode.algorithms.easy;

public class CountPrimes {
  public int countPrimes(int n) {
    boolean[] notPrime = new boolean[n];
    int primes = 0;
    for (int i = 2; i < n; i++) {
      if (!notPrime[i]) {
        primes++;
        for (int j = 2; i * j < n; j++) {
          notPrime[i * j] = true;
        }
      }
    }
    return primes;
  }
}
