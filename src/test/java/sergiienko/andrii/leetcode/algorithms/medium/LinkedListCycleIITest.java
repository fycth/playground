package sergiienko.andrii.leetcode.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListCycleIITest {
  @Test
  public void case1() {
    LinkedListCycleII.ListNode head = new LinkedListCycleII().new ListNode(3);
    LinkedListCycleII.ListNode l2 = new LinkedListCycleII().new ListNode(2);
    LinkedListCycleII.ListNode l0 = new LinkedListCycleII().new ListNode(0);
    LinkedListCycleII.ListNode tail = new LinkedListCycleII().new ListNode(-4);
    head.next = l2;
    l2.next = l0;
    l0.next = tail;
    tail.next = l2;

    assertEquals(l2, new LinkedListCycleII().detectCycle(head));
  }
}
