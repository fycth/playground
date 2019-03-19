package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class DeleteNodeInALinkedListTest {
  @Test
  public void case1() {
    ListNode listNode = new DeleteNodeInALinkedList().fromArray(new int[]{5,1,9});
    ListNode l = new DeleteNodeInALinkedList().fromArray(new int[]{4});
    l.next = listNode;
    new DeleteNodeInALinkedList().deleteNode(listNode);
    int[] expected = new int[]{4,1,9};
    int[] actual = new DeleteNodeInALinkedList().toArray(l);
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    ListNode listNode = new DeleteNodeInALinkedList().fromArray(new int[]{1,9});
    ListNode l = new DeleteNodeInALinkedList().fromArray(new int[]{4,5});
    l.next.next = listNode;
    new DeleteNodeInALinkedList().deleteNode(listNode);
    int[] expected = new int[]{4,5,9};
    int[] actual = new DeleteNodeInALinkedList().toArray(l);
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
