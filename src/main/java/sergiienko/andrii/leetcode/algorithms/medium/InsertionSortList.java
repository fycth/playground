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
