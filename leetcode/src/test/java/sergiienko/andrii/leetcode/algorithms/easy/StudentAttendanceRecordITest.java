package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class StudentAttendanceRecordITest {
  @Test
  public void case1() {
    assertTrue(new StudentAttendanceRecordI().checkRecord("PPALLP"));
  }

  @Test
  public void case2() {
    assertFalse(new StudentAttendanceRecordI().checkRecord("PPALLL"));
  }

  @Test
  public void case3() {
    assertFalse(new StudentAttendanceRecordI().checkRecord("ALLAPPL"));
  }
}
