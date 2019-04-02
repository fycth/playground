package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base7Test {
  @Test
  public void case1() {
    assertEquals("202", new Base7().convertToBase7(100));
  }

  @Test
  public void case2() {
    assertEquals("-10", new Base7().convertToBase7(-7));
  }

  @Test
  public void case3() {
    assertEquals("10", new Base7().convertToBase7(7));
  }
}
