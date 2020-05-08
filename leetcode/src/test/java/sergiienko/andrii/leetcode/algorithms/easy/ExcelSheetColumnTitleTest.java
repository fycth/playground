package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnTitleTest {
  @Test
  public void case1() {
    assertEquals("A", new ExcelSheetColumnTitle().convertToTitle(1));
  }
  @Test
  public void case2() {
    assertEquals("AB", new ExcelSheetColumnTitle().convertToTitle(28));
  }
  @Test
  public void case3() {
    assertEquals("ZY", new ExcelSheetColumnTitle().convertToTitle(701));
  }
  @Test
  public void case4() {
    assertEquals("Z", new ExcelSheetColumnTitle().convertToTitle(26));
  }
  @Test
  public void case5() {
    assertEquals("AZ", new ExcelSheetColumnTitle().convertToTitle(52));
  }
}
