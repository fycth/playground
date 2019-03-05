package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrStrTest {
  @Test
  public void genericTest() {
    assertEquals(2, new StrStr().strStr("hello", "ll"));
    assertEquals(-1, new StrStr().strStr("aaaaa", "bba"));
    assertEquals(-1, new StrStr().strStr("", "bba"));
    assertEquals(0, new StrStr().strStr("", ""));
    assertEquals(-1, new StrStr().strStr("1", "bba"));
    assertEquals(0, new StrStr().strStr("12", ""));
    assertEquals(-1, new StrStr().strStr("missisippi", "issipi"));
  }
}
