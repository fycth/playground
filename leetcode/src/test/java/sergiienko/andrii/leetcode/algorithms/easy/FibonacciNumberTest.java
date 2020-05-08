package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {
  @Test
  public void case1() {
    assertEquals(1, new FibonacciNumber().fib(2));
  }

  @Test
  public void case2() {
    assertEquals(2, new FibonacciNumber().fib(3));
  }

  @Test
  public void case3() {
    assertEquals(3, new FibonacciNumber().fib(4));
  }
}
