package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class UglyNumber {
  public boolean isUgly(int num) {
    if (num == 1) return true;
    if (num <= 0) return false;

    Set<Integer> set = new HashSet<>();

    int n = num;
    while (n % 2 == 0) {
      set.add(2);
      n /= 2;
    }
    
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      while (n % i == 0) {
        set.add(i);
        n /= i;
      }
    }

    if (n > 2) set.add(n);

    for (int i : set) {
      if (i != 2 && i != 3 && i != 5) return false;
    }

    return true;
  }
}
