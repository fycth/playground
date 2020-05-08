package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {
  @Test
  public void case1() {
    assertEquals(42, new StringToInteger().myAtoi("42"));
  }

  @Test
  public void case2() {
    assertEquals(-42, new StringToInteger().myAtoi("   -42"));
  }

  @Test
  public void case3() {
    assertEquals(4193, new StringToInteger().myAtoi("4193 with words"));
  }

  @Test
  public void case4() {
    assertEquals(0, new StringToInteger().myAtoi("words and 987"));
  }

  @Test
  public void case5() {
    assertEquals(-2147483648, new StringToInteger().myAtoi("-91283472332"));
  }

  @Test
  public void case6() {
    assertEquals(0, new StringToInteger().myAtoi("+-2"));
  }

  @Test
  public void case7() {
    assertEquals(2147483647, new StringToInteger().myAtoi("9223372036854775808"));
  }

  @Test
  public void case8() {
    assertEquals(-2147483648, new StringToInteger().myAtoi("-9223372036854775809"));
  }
}
