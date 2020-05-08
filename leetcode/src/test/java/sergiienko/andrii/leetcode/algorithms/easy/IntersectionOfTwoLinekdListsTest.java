package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntersectionOfTwoLinekdListsTest {
  @Test
  public void case1() {
    ListNode listNodeA = new ListNode(5);
    ListNode l = new ListNode(4);
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(8);
    l.next = listNodeA;
    listNodeA = l;
    ListNode expectedNode = l;
    l = new ListNode(1);
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(4);
    l.next = listNodeA;
    listNodeA = l;

    ListNode listNodeB = new ListNode(1);
    listNodeB.next = expectedNode;
    l = new ListNode(0);
    l.next = listNodeB;
    listNodeB = l;
    l = new ListNode(5);
    l.next = listNodeB;
    listNodeB = l;

    ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertEquals(expectedNode, actualNode);
  }
  @Test
  public void case3() {
    ListNode listNodeA = new ListNode(4);
    ListNode l = new ListNode(2);
    ListNode expectedNode = l;
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(1);
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(9);
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(0);
    l.next = listNodeA;
    listNodeA = l;

    ListNode listNodeB = new ListNode(3);
    listNodeB.next = expectedNode;

    ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertEquals(expectedNode, actualNode);
  }
  @Test
  public void case4() {
    ListNode listNodeA = new ListNode(4);
    ListNode l = new ListNode(6);
    l.next = listNodeA;
    listNodeA = l;
    l = new ListNode(2);
    l.next = listNodeA;
    listNodeA = l;

    ListNode listNodeB = new ListNode(5);
    l = new ListNode(1);
    l.next = listNodeB;
    listNodeB = l;

    ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertNull(actualNode);
  }
}
