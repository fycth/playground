package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class RemoveLinkedListElement extends ListHelper {
  public ListNode removeElements(ListNode head, int val) {
    ListNode i = head;
    ListNode l = null;
    while (i != null) {
      if (i.val == val) {
        if (l == null) {
          head = i.next;
        } else {
          l.next = i.next;
        }
      } else {
        l = i;
      }
      i = i.next;
    }
    return head;
  }
}
