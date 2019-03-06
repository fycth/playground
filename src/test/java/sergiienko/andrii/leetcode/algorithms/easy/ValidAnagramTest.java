package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidAnagramTest {
  @Test
  public void case1() {
    assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
  }
  @Test
  public void case2() {
    assertFalse(new ValidAnagram().isAnagram("rat", "car"));
  }
  @Test
  public void case3() {
    assertFalse(new ValidAnagram().isAnagram("a", "ab"));
  }
  @Test
  public void case4() {
    assertFalse(new ValidAnagram().isAnagram("ab", "a"));
  }
}
