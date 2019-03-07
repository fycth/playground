package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertANumberToHexadecimalTest {
  @Test
  public void case1() {
    assertEquals("1a", new ConvertANumberToHexadecimal().toHex(26));
  }
  @Test
  public void case2() {
    assertEquals("0", new ConvertANumberToHexadecimal().toHex(0));
  }
  @Test
  public void case3() {
    assertEquals("1", new ConvertANumberToHexadecimal().toHex(1));
  }
  @Test
  public void case4() {
    assertEquals("ffffffff", new ConvertANumberToHexadecimal().toHex(-1));
  }
  @Test
  public void case5() {
    assertEquals("1b207", new ConvertANumberToHexadecimal().toHex(111111));
  }
}
