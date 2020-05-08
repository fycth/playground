package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {
  @Test
  public void case1() {
    assertEquals(2, new NumberComplement().findComplement(5));
  }

  @Test
  public void case2() {
    assertEquals(0, new NumberComplement().findComplement(7));
  }

  @Test
  public void case3() {
    assertEquals(5, new NumberComplement().findComplement(10));
  }

  @Test
  public void case4() {
    assertEquals(1, new NumberComplement().findComplement(0));
  }
}
