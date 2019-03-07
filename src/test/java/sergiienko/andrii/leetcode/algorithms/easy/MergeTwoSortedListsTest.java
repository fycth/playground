package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {
  @Test
  public void case1() {
    MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists().fromArray(new int[]{1,2,4});
    MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists().fromArray(new int[]{1,3,4});
    MergeTwoSortedLists.ListNode listNode = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
    int[] actual = new MergeTwoSortedLists().toArray(listNode);
    int[] expected = new int[]{1,1,2,3,4,4};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
