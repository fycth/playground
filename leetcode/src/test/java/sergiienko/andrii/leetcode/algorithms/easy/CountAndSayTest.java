package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {
  @Test
  public void case1() {
    assertEquals("1", new CountAndSay().countAndSay(1));
  }
  @Test
  public void case2() {
    assertEquals("1211", new CountAndSay().countAndSay(4));
  }
}
