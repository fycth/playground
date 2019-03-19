package sergiienko.andrii.leetcode.algorithms.medium;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class SwapNodesInPairs extends ListHelper {
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
}
