package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntTest {
  @Test
  public void genericTest() {
    assertEquals(3, new RomanToInt().romanToInt("III"));
    assertEquals(4, new RomanToInt().romanToInt("IV"));
    assertEquals(9, new RomanToInt().romanToInt("IX"));
    assertEquals(58, new RomanToInt().romanToInt("LVIII"));
    assertEquals(1994, new RomanToInt().romanToInt("MCMXCIV"));
  }
}
