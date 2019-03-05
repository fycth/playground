package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IntersectionOfTwoLinekdListsTest {
  @Test
  public void case1() {
    IntersectionOfTwoLinekdLists.ListNode listNodeA = new IntersectionOfTwoLinekdLists().new ListNode(5);
    IntersectionOfTwoLinekdLists.ListNode l = new IntersectionOfTwoLinekdLists().new ListNode(4);
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(8);
    l.next = listNodeA;
    listNodeA = l;
    IntersectionOfTwoLinekdLists.ListNode expectedNode = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(1);
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(4);
    l.next = listNodeA;
    listNodeA = l;

    IntersectionOfTwoLinekdLists.ListNode listNodeB = new IntersectionOfTwoLinekdLists().new ListNode(1);
    listNodeB.next = expectedNode;
    l = new IntersectionOfTwoLinekdLists().new ListNode(0);
    l.next = listNodeB;
    listNodeB = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(5);
    l.next = listNodeB;
    listNodeB = l;

    IntersectionOfTwoLinekdLists.ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertEquals(expectedNode, actualNode);
  }
  @Test
  public void case3() {
    IntersectionOfTwoLinekdLists.ListNode listNodeA = new IntersectionOfTwoLinekdLists().new ListNode(4);
    IntersectionOfTwoLinekdLists.ListNode l = new IntersectionOfTwoLinekdLists().new ListNode(2);
    IntersectionOfTwoLinekdLists.ListNode expectedNode = l;
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(1);
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(9);
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(0);
    l.next = listNodeA;
    listNodeA = l;

    IntersectionOfTwoLinekdLists.ListNode listNodeB = new IntersectionOfTwoLinekdLists().new ListNode(3);
    listNodeB.next = expectedNode;

    IntersectionOfTwoLinekdLists.ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertEquals(expectedNode, actualNode);
  }
  @Test
  public void case4() {
    IntersectionOfTwoLinekdLists.ListNode listNodeA = new IntersectionOfTwoLinekdLists().new ListNode(4);
    IntersectionOfTwoLinekdLists.ListNode l = new IntersectionOfTwoLinekdLists().new ListNode(6);
    l.next = listNodeA;
    listNodeA = l;
    l = new IntersectionOfTwoLinekdLists().new ListNode(2);
    l.next = listNodeA;
    listNodeA = l;

    IntersectionOfTwoLinekdLists.ListNode listNodeB = new IntersectionOfTwoLinekdLists().new ListNode(5);
    l = new IntersectionOfTwoLinekdLists().new ListNode(1);
    l.next = listNodeB;
    listNodeB = l;

    IntersectionOfTwoLinekdLists.ListNode actualNode = new IntersectionOfTwoLinekdLists().getIntersectionNode(listNodeA, listNodeB);

    assertNull(actualNode);
  }
}
