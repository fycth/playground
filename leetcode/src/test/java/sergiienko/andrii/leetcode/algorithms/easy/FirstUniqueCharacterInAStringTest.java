package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInAStringTest {
  @Test
  public void case1() {
    assertEquals(0, new FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
  }

  @Test
  public void case2() {
    assertEquals(2, new FirstUniqueCharacterInAString().firstUniqChar("loveleetcode"));
  }

  @Test
  public void case3() {
    assertEquals(0, new FirstUniqueCharacterInAString().firstUniqChar("l"));
  }

  @Test
  public void case4() {
    assertEquals(-1, new FirstUniqueCharacterInAString().firstUniqChar("lleett"));
  }

  @Test
  public void case5() {
    assertEquals(-1, new FirstUniqueCharacterInAString().firstUniqChar("ll"));
  }

  @Test
  public void case6() {
    assertEquals(0, new FirstUniqueCharacterInAString().firstUniqChar("le"));
  }

  @Test
  public void case7() {
    assertEquals(-1, new FirstUniqueCharacterInAString().firstUniqChar("aadadaad"));
  }
}
