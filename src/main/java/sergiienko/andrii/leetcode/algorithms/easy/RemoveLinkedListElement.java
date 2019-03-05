package sergiienko.andrii.leetcode.algorithms.easy;

public class RemoveLinkedListElement {
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

  class ListNode {
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
