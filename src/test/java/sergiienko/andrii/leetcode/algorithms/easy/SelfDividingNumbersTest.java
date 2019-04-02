package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelfDividingNumbersTest {
  @Test
  public void case1() {
    int[] expectedList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
    List<Integer> actualList = new SelfDividingNumbers().selfDividingNumbers(1, 22);
    assertEquals(expectedList.length, actualList.size());
    for (int i = 0; i < expectedList.length; i++) {
      assertEquals(expectedList[i], (int)actualList.get(i));
    }
  }
}
