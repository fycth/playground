package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseVowelsOfAStringTest {
  @Test
  public void case1() {
    String input = "hello";
    String expected = "holle";
    String actual = new ReverseVowelsOfAString().reverseString(input);
    assertEquals(expected, actual);
  }
  @Test
  public void case2() {
    String input = "leetcode";
    String expected = "leotcede";
    String actual = new ReverseVowelsOfAString().reverseString(input);
    assertEquals(expected, actual);
  }
  @Test
  public void case3() {
    String input = "qwrt";
    String expected = "qwrt";
    String actual = new ReverseVowelsOfAString().reverseString(input);
    assertEquals(expected, actual);
  }
  @Test
  public void case4() {
    String input = "aA";
    String expected = "Aa";
    String actual = new ReverseVowelsOfAString().reverseString(input);
    assertEquals(expected, actual);
  }
}
