package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddStringsTest {
  @Test
  public void case1() {
    assertEquals("4", new AddStrings().addStrings("3", "1"));
  }

  @Test
  public void case2() {
    assertEquals("40", new AddStrings().addStrings("30", "10"));
  }

  @Test
  public void case3() {
    assertEquals("100", new AddStrings().addStrings("99", "1"));
  }

  @Test
  public void case4() {
    assertEquals("300025", new AddStrings().addStrings("300000", "25"));
  }
}
