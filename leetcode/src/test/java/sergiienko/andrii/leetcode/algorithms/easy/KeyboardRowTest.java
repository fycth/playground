package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardRowTest {
  @Test
  public void case1() {
    String[] expectedList = new String[]{"Alaska", "Dad"};
    String[] actualList = new KeyboardRow().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    assertEquals(expectedList.length, actualList.length);
    for (int i = 0; i < expectedList.length; i++) {
      assertEquals(expectedList[i], actualList[i]);
    }
  }
}
