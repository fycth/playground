package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTwoIntegersTest {
  @Test
  public void case1() {
    assertEquals(3, new SumOfTwoIntegers().getSum(1, 2));
  }
  @Test
  public void case2() {
    assertEquals(1, new SumOfTwoIntegers().getSum(-2, 3));
  }
  @Test
  public void case3() {
    assertEquals(-20, new SumOfTwoIntegers().getSum(-12, -8));
  }
  @Test
  public void case4() {
    assertEquals(10, new SumOfTwoIntegers().getSum(-20, 30));
  }
  @Test
  public void case5() {
    assertEquals(-50, new SumOfTwoIntegers().getSum(-20, -30));
  }
  @Test
  public void case6() {
    assertEquals(-1, new SumOfTwoIntegers().getSum(2147483647, -2147483648));
  }
}
