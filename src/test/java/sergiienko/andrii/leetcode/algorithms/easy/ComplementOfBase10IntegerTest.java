package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplementOfBase10IntegerTest {
  @Test
  public void case1() {
    assertEquals(2, new ComplementOfBase10Integer().bitwiseComplement(5));
  }

  @Test
  public void case2() {
    assertEquals(0, new ComplementOfBase10Integer().bitwiseComplement(7));
  }

  @Test
  public void case3() {
    assertEquals(5, new ComplementOfBase10Integer().bitwiseComplement(10));
  }

  @Test
  public void case4() {
    assertEquals(1, new ComplementOfBase10Integer().bitwiseComplement(0));
  }
}
