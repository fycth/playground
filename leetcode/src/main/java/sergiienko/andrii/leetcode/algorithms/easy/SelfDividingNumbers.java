package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> res = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      int n = i;
      boolean f = true;
      while (true) {
        int r = n % 10;
        if (r == 0 || i % r != 0) {
          f = false;
          break;
        }
        n = n / 10;
        if (n == 0) break;
      }
      if (f) res.add(i);
    }
    return res;
  }
}
