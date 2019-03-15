package sergiienko.andrii.leetcode.algorithms.easy;

public class SortArrayByParity {
  public int[] sortArrayByParity(int[] A) {
    int[] res = new int[A.length];
    System.arraycopy(A, 0, res, 0, A.length);
    int l = 0;
    int r = res.length - 1;
    while (true) {
      while (res[l] % 2 == 0 && l < r) l++;
      while (res[r] % 2 != 0 && l < r) r--;
      if (l < r) {
        int b = res[l];
        res[l] = res[r];
        res[r] = b;
      } else {
        break;
      }
    }
    return res;
  }
}
