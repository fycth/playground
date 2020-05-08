package sergiienko.andrii.leetcode.algorithms.medium;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class LinkedListCycleII extends ListHelper {
  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) return null;
    ListNode r = head.next;
    ListNode t = head;
    boolean met = false;
    while (r != null && t != null) {
      if (r == t) {
        if (met) {
          return r;
        } else {
          met = true;
          r = head;
          t = t.next;
        }
      } else {
        t = t.next;
        r = r.next;
        if (r != null && !met) r = r.next;
      }
    }
    return null;
  }
}
