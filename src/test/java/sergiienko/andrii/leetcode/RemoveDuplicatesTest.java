package sergiienko.andrii.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
  @Test
  public void genericTest() {
    assertEquals(2, new RemoveDuplicates().removeDuplicates(new int[]{1,1,2}));
    assertEquals(5, new RemoveDuplicates().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    assertEquals(1, new RemoveDuplicates().removeDuplicates(new int[]{0}));
    assertEquals(0, new RemoveDuplicates().removeDuplicates(new int[]{}));
    assertEquals(1, new RemoveDuplicates().removeDuplicates(new int[]{1,1}));
  }
}
