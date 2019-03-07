package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {
  @Test
  public void case1() {
    assertEquals(1, new ExcelSheetColumnNumber().titleToNumber("A"));
  }
  @Test
  public void case2() {
    assertEquals(28, new ExcelSheetColumnNumber().titleToNumber("AB"));
  }
  @Test
  public void case3() {
    assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
  }
}
