package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LinkedListCycleTest {
  @Test
  public void case1() {
    LinkedListCycle.ListNode head = new LinkedListCycle().new ListNode(3);
    LinkedListCycle.ListNode l2 = new LinkedListCycle().new ListNode(2);
    LinkedListCycle.ListNode l0 = new LinkedListCycle().new ListNode(0);
    LinkedListCycle.ListNode tail = new LinkedListCycle().new ListNode(-4);
    head.next = l2;
    l2.next = l0;
    l0.next = tail;
    tail.next = l2;

    assertTrue(new LinkedListCycle().hasCycle(head));
  }
  @Test
  public void case2() {
    LinkedListCycle.ListNode head = new LinkedListCycle().new ListNode(1);
    LinkedListCycle.ListNode tail = new LinkedListCycle().new ListNode(2);
    head.next = tail;
    tail.next = head;

    assertTrue(new LinkedListCycle().hasCycle(head));
  }
  @Test
  public void case3() {
    LinkedListCycle.ListNode head = new LinkedListCycle().new ListNode(1);

    assertFalse(new LinkedListCycle().hasCycle(head));
  }
}
