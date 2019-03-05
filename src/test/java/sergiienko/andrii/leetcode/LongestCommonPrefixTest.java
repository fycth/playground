package sergiienko.andrii.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {
  @Test
  public void genericTest() {
    assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{}));
    assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{""}));
    assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"", "b"}));
  }
}
