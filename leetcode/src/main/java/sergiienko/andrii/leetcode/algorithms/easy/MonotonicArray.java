package sergiienko.andrii.leetcode.algorithms.easy;

public class MonotonicArray {
  public boolean isMonotonic(int[] A) {
    boolean res = true;
    if (A.length > 2) {
      int d = 0;
      int j = 0;
      while (j + 1 < A.length && d == 0) {
        if (A[j] > A[j + 1]) {
          d = -1;
        } else if (A[j] < A[j + 1]) {
          d = 1;
        }
        j++;
      }
      int i = 0;
      while (i + 1 < A.length) {
        if ((d < 0 && (A[i] < A[i+1])) || (d > 0 && A[i] > A[i+1])) {
          res = false;
          break;
        }
        i++;
      }
    }
    return res;
  }
}
