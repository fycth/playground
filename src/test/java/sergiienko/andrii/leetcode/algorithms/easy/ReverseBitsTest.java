package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {
  @Test
  public void case1() {
    assertEquals(964176192, new ReverseBits().reverseBits(43261596));
  }
  @Test
  public void case2() {
    assertEquals(-1073741825, new ReverseBits().reverseBits(-3));
  }
}
