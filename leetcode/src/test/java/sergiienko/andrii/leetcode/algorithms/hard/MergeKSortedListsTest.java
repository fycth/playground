package sergiienko.andrii.leetcode.algorithms.hard;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class MergeKSortedListsTest {
  @Test
  public void case1() {
    ListNode l1 = new MergeKSortedLists().fromArray(new int[]{1,4,5});
    ListNode l2 = new MergeKSortedLists().fromArray(new int[]{1,3,4});
    ListNode l3 = new MergeKSortedLists().fromArray(new int[]{2,6});
    ListNode[] ls = new ListNode[]{l1,l2,l3};
    ListNode listNode = new MergeKSortedLists().mergeKLists(ls);
    int[] actual = new MergeKSortedLists().toArray(listNode);
    int[] expected = new int[]{1,1,2,3,4,4,5,6};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
