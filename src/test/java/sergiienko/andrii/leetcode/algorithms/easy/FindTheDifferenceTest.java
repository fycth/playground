package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDifferenceTest {
  @Test
  public void case1() {
    assertEquals('e', new FindTheDifference().findTheDifference("abcd", "abcde"));
  }
}
