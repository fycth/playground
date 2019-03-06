package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
  @Test
  public void case1() {
    char[] input = new char[]{'h','e','l','l','o'};
    char[] actual = new char[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    char[] expected = new char[]{'o','l','l','e','h'};
    new ReverseString().reverseString(actual);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case2() {
    char[] input = new char[]{'H','a','n','n','a','h'};
    char[] actual = new char[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    char[] expected = new char[]{'h','a','n','n','a','H'};
    new ReverseString().reverseString(actual);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
  @Test
  public void case3() {
    char[] input = new char[]{'H','a'};
    char[] actual = new char[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    char[] expected = new char[]{'h','a'};
    new ReverseString().reverseString(actual);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
