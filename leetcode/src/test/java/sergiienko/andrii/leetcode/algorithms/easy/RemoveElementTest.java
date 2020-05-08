package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
  @Test
  public void genericTest() {
    assertEquals(2, new RemoveElement().removeElement(new int[]{3,2,2,3}, 3));
    assertEquals(5, new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
  }
}
