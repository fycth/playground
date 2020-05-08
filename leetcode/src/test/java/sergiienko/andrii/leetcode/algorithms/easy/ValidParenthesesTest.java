package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidParenthesesTest {
  @Test
  public void case1() {
    assertTrue(new ValidParentheses().isValid("()"));
  }
  @Test
  public void case2() {
    assertTrue(new ValidParentheses().isValid("()[]{}"));
  }
  @Test
  public void case3() {
    assertFalse(new ValidParentheses().isValid("(]"));
  }
  @Test
  public void case4() {
    assertFalse(new ValidParentheses().isValid("([)]"));
  }
  @Test
  public void case5() {
    assertTrue(new ValidParentheses().isValid("{[]}"));
  }
  @Test
  public void case6() {
    assertTrue(new ValidParentheses().isValid(""));
  }
}
