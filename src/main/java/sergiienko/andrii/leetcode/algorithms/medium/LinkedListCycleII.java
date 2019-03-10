package sergiienko.andrii.leetcode.algorithms.medium;

public class LinkedListCycleII {
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
  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  ListNode fromArray(int[] array) {
    ListNode head = null;
    if (array.length > 0) {
      for (int i : array) {
        ListNode listNode = new ListNode(i);
        if (head == null) {
          head = listNode;
        } else {
          ListNode h = head;
          while (h.next != null) {
            h = h.next;
          }
          h.next = listNode;
        }
      }
    }
    return head;
  }

  int[] toArray(ListNode head) {
    ListNode h = head;
    int l = 0;
    while (h != null) {
      h = h.next;
      l++;
    }
    if (l == 0) {
      return new int[0];
    }
    int[] res = new int[l];
    h = head;
    int i = 0;
    while (h != null) {
      res[i] = h.val;
      h = h.next;
      i++;
    }
    return res;
  }
}
