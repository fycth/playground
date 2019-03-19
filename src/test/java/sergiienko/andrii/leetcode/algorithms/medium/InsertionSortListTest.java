package sergiienko.andrii.leetcode.algorithms.medium;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class InsertionSortListTest {
  @Test
  public void case1() {
    ListNode listNode = new InsertionSortList().fromArray(new int[]{4,2,1,3});
    listNode = new InsertionSortList().insertionSortList(listNode);
    int[] actual = new InsertionSortList().toArray(listNode);
    int[] expected = new int[]{1,2,3,4};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
