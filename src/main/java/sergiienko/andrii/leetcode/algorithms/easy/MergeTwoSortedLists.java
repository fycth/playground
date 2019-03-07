package sergiienko.andrii.leetcode.algorithms.easy;

public class MergeTwoSortedLists {
  ListNode head;
  ListNode tail;
  public MergeTwoSortedLists() {
    head = null;
    tail = null;
  }
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
