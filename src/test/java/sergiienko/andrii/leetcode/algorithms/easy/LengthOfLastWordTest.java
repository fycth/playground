package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {
  @Test
  public void case1() {
    assertEquals(5, new LengthOfLastWord().lengthOfLastWord("Hello World"));
  }
  @Test
  public void case2() {
    assertEquals(10, new LengthOfLastWord().lengthOfLastWord("HelloWorld"));
  }
  @Test
  public void case3() {
    assertEquals(0, new LengthOfLastWord().lengthOfLastWord(""));
  }
  @Test
  public void case4() {
    assertEquals(1, new LengthOfLastWord().lengthOfLastWord("a "));
  }
}
