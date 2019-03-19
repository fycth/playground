package sergiienko.andrii.leetcode.algorithms.medium;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class LinkedListCycleIITest {
  @Test
  public void case1() {
    ListNode head = new ListNode(3);
    ListNode l2 = new ListNode(2);
    ListNode l0 = new ListNode(0);
    ListNode tail = new ListNode(-4);
    head.next = l2;
    l2.next = l0;
    l0.next = tail;
    tail.next = l2;

    assertEquals(l2, new LinkedListCycleII().detectCycle(head));
  }
}
