package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {
  @Test
  public void genericTest() {
    assertTrue(new IsPalindrome().isPalindrome(121));
    assertFalse(new IsPalindrome().isPalindrome(-121));
    assertFalse(new IsPalindrome().isPalindrome(10));
    assertTrue(new IsPalindrome().isPalindrome(0));
    assertFalse(new IsPalindrome().isPalindrome(-1));
  }
}
