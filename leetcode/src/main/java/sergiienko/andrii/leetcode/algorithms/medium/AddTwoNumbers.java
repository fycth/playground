package sergiienko.andrii.leetcode.algorithms.medium;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class AddTwoNumbers extends ListHelper {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode tail = null;
    int b = 0;
    while (l1 != null || l2 != null) {
      int n1 = 0;
      int n2 = 0;
      if (l1 != null) {
        n1 = l1.val;
      }
      if (l2 != null) {
        n2 = l2.val;
      }
      int n = n2 + n1 + b;
      if (n >= 10) {
        b = n / 10;
        n = n - 10;
      } else {
        b = 0;
      }
      ListNode l = new ListNode(n);
      if (head == null) {
        head = l;
        tail = l;
      } else {
        tail.next = l;
        tail = l;
      }
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (b != 0) {
      ListNode l = new ListNode(b);
      tail.next = l;
    }
    return head;
  }
}
