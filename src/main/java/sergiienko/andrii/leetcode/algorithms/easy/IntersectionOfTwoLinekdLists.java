package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListNode;

public class IntersectionOfTwoLinekdLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    while (a != null) {
      ListNode b = headB;
      while (b != null) {
        if (b.equals(a)) {
            return b;
          }
        b = b.next;
      }
      a = a.next;
    }
    return null;
  }
}
