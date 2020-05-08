package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class OneBitAndTwoBitCharactersTest {
  @Test
  public void case1() {
    assertTrue(new OneBitAndTwoBitCharacters().isOneBitCharacter(new int[]{1, 0, 0}));
  }

  @Test
  public void case2() {
    assertFalse(new OneBitAndTwoBitCharacters().isOneBitCharacter(new int[]{1, 1, 1, 0}));
  }

  @Test
  public void case3() {
    assertTrue(new OneBitAndTwoBitCharacters().isOneBitCharacter(new int[]{1, 1, 0}));
  }
}
