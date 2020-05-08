package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInAString3Test {
  @Test
  public void case1() {
    assertEquals("s'teL ekat edoCteeL tsetnoc", new ReverseWordsInAString3().reverseWords("Let's take LeetCode contest"));
  }
}
