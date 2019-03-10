package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ContainsDuplicateTest {
  @Test
  public void case1() {
    assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
  }
  @Test
  public void case2() {
    assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
  }
  @Test
  public void case3() {
    assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
  }
}
