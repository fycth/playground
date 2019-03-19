package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class RemoveDuplicatesFromSortedList extends ListHelper {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode h = head;
    while (head != null && head.next != null) {
      if (head.val == head.next.val) {
        head.next = head.next.next;
      } else {
        head = head.next;
      }
    }
    return h;
  }
}
