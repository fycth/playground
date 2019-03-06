package sergiienko.andrii.leetcode.algorithms.medium;

public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode resHead = head.next;
    ListNode l = null;
    ListNode currentNode = head;
    ListNode nextNode = head.next;
    while (nextNode != null) {
      currentNode.next = nextNode.next;
      nextNode.next = currentNode;
      if (l == null) {
        l = currentNode;
      } else {
        l.next = nextNode;
        l = currentNode;
      }
      currentNode = currentNode.next;
      if (currentNode != null) {
        nextNode = currentNode.next;
      } else {
        nextNode = null;
      }
    }
    return resHead;
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
