package sergiienko.andrii.leetcode.algorithms.easy;

public class StudentAttendanceRecordI {
  public boolean checkRecord(String s) {
    boolean res = true;
    int a = 0;
    int l = 0;
    if (s != null && !s.isEmpty()) {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'A') a++;
        if (s.charAt(i) == 'L') {
          while (i < s.length() && s.charAt(i) == 'L') {
            i++;
            l++;
          }
          i--;
        }
        if (a > 1 || l > 2) {
          res = false;
          break;
        } else {
          l = 0;
        }
      }
    }
    return res;
  }
}
