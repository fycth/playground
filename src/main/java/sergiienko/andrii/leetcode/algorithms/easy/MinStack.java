package sergiienko.andrii.leetcode.algorithms.easy;

public class MinStack {
  private int min = 0;
  private Node head;
  private boolean f = false;

  public MinStack() {
  }

  public void push(int x) {
    if (!f) {
      min = x;
      f = true;
    } else {
      if (x < min) {
        min = x;
      }
    }
    Node n = new Node(x);
    n.next = head;
    head = n;
  }

  public void pop() {
    if (head != null) {
      head = head.next;
      if (head == null) {
        f = false;
      } else {
        min = head.val;
      }
      Node h = head;
      while (h != null) {
        if (h.val < min) {
          min = h.val;
        }
        h = h.next;
      }
    }
  }

  public int top() {
    return head.val;
  }

  public int getMin() {
    return min;
  }

  class Node {
    int val;
    Node next;
    Node(int val) {
      this.val = val;
    }
  }
}
