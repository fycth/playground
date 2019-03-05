package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
  @Test
  public void testGeneric() {
    assertEquals(321, new ReverseInteger().reverse(123));
    assertEquals(-321, new ReverseInteger().reverse(-123));
    assertEquals(21, new ReverseInteger().reverse(120));
    assertEquals(0, new ReverseInteger().reverse(1534236469));
    assertEquals(0, new ReverseInteger().reverse(-2147483648));
  }
}
