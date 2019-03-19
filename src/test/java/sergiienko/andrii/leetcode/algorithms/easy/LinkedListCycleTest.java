package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LinkedListCycleTest {
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

    assertTrue(new LinkedListCycle().hasCycle(head));
  }
  @Test
  public void case2() {
    ListNode head = new ListNode(1);
    ListNode tail = new ListNode(2);
    head.next = tail;
    tail.next = head;

    assertTrue(new LinkedListCycle().hasCycle(head));
  }
  @Test
  public void case3() {
    ListNode head = new ListNode(1);

    assertFalse(new LinkedListCycle().hasCycle(head));
  }
}
