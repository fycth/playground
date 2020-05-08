package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {
  @Test
  public void case1() {
    assertEquals("hello", new ToLowerCase().toLowerCase("Hello"));
  }
  @Test
  public void case2() {
    assertEquals("here", new ToLowerCase().toLowerCase("here"));
  }
  @Test
  public void case3() {
    assertEquals("lovely", new ToLowerCase().toLowerCase("LOVELY"));
  }
}
