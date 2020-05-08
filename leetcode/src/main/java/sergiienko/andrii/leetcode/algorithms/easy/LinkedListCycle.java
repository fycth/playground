package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class LinkedListCycle extends ListHelper {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;
    ListNode r = head.next;
    ListNode t = head;
    while (r != null && t != null) {
      if (r == t) {
        return true;
      }
      t = t.next;
      r = r.next;
      if (r != null) r = r.next;
    }
    return false;
  }
}
