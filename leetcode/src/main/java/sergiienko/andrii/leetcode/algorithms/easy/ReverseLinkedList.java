package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class ReverseLinkedList extends ListHelper {
  public ListNode reverseList(ListNode head) {
    ListNode h = null;
    while (head != null) {
      ListNode tail = head.next;
      head.next = h;
      h = head;
      head = tail;
    }
    return h;
  }
}
