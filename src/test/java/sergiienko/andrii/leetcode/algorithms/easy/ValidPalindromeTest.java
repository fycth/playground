package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidPalindromeTest {
  @Test
  public void case1() {
    assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
  }
  @Test
  public void case2() {
    assertFalse(new ValidPalindrome().isPalindrome("race a car"));
  }
  @Test
  public void case3() {
    assertTrue(new ValidPalindrome().isPalindrome(""));
  }
  @Test
  public void case4() {
    assertTrue(new ValidPalindrome().isPalindrome("  "));
  }
  @Test
  public void case5() {
    assertFalse(new ValidPalindrome().isPalindrome("0P"));
  }
}
