package sergiienko.andrii.leetcode.algorithms.medium;

public class InsertionSortList {
  public ListNode insertionSortList(ListNode head) {
    ListNode h = null;
    while (head != null) {
      ListNode current = head;
      head = head.next;
      if (h == null || current.val < h.val) {
        current.next = h;
        h = current;
      } else {
        ListNode p = h;
        while (true) {
          if (p.next == null || current.val < p.next.val) {
            current.next = p.next;
            p.next = current;
            break;
          }
          p = p.next;
        }
      }
    }
    return h;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
