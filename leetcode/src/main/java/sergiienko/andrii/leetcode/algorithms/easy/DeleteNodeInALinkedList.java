package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.ListHelper;
import sergiienko.andrii.leetcode.helpers.ListNode;

public class DeleteNodeInALinkedList extends ListHelper {
  public void deleteNode(ListNode node) {
    ListNode l = null;
    while (node.next != null) {
      node.val = node.next.val;
      l = node;
      node = node.next;
    }
    l.next = null;
  }
}
