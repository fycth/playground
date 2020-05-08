package sergiienko.andrii.leetcode.algorithms.hard;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class MergeKSortedLists extends ListHelper {
  private ListNode head;
  private ListNode tail;
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists.length == 0) return null;
    ListNode res = null;
    for (ListNode list : lists) {
      head = null;
      tail = null;
      res = mergeTwoLists(res, list);
    }
    return res;
  }
  private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    while (l1 != null || l2 != null) {
      if (l1 == null) {
        appendToEnd(l2);
        l2 = l2.next;
      } else if (l2 == null) {
        appendToEnd(l1);
        l1 = l1.next;
      } else {
        if (l1.val < l2.val) {
          appendToEnd(l1);
          l1 = l1.next;
        } else {
          appendToEnd(l2);
          l2 = l2.next;
        }
      }
    }
    return head;
  }

  private void appendToEnd(ListNode l) {
    if (head == null) {
      head = l;
      tail = l;
    } else {
      tail.next = l;
      tail = tail.next;
    }
  }
}
