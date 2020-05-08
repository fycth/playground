package sergiienko.andrii.leetcode.algorithms.easy;

public class AddBinary {
  public String addBinary(String a, String b) {
    int ai = a.length() - 1;
    int bi = b.length() - 1;
    StringBuilder res = new StringBuilder();
    byte m = 0;
    for (int i = ai > bi ? ai : bi; i >= 0; i--) {
      byte an;
      byte bn;
      if (ai >= 0 && a.charAt(ai) == '1') {
        an = 1;
      } else {
        an = 0;
      }
      if (bi >= 0 && b.charAt(bi) == '1') {
        bn = 1;
      } else {
        bn = 0;
      }
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
      res.insert(0, n);
      ai--;
      bi--;
    }
    if (m != 0) {
      res.insert(0, m);
    }
    return res.toString();
  }
}
