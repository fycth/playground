package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class MonotonicArrayTest {
  @Test
  public void case1() {
    assertTrue(new MonotonicArray().isMonotonic(new int[]{1,2,2,3}));
  }
  @Test
  public void case2() {
    assertTrue(new MonotonicArray().isMonotonic(new int[]{6,5,4,4}));
  }
  @Test
  public void case3() {
    assertFalse(new MonotonicArray().isMonotonic(new int[]{1,3,2}));
  }
  @Test
  public void case4() {
    assertTrue(new MonotonicArray().isMonotonic(new int[]{1,2,4,5}));
  }
  @Test
  public void case5() {
    assertTrue(new MonotonicArray().isMonotonic(new int[]{1,1,1}));
  }
  @Test
  public void case6() {
    assertFalse(new MonotonicArray().isMonotonic(new int[]{11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5}));
  }
}
