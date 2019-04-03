package sergiienko.andrii.leetcode.algorithms.easy;

public class DesignLinkedList {
  private Node head;
  private Node tail;

  public DesignLinkedList() {

  }

  public int get(int index) {
    int res = -1;
    int i = 0;
    Node n = head;
    while (i < index && n != null) {
      i++;
      n = n.nextNode;
    }
    if (i == index && n != null) res = n.value;
    return res;
  }

  public void addAtHead(int val) {
    Node node = new Node(val);
    node.setNextNode(head);
    head = node;
    if (tail == null) tail = head;
  }

  public void addAtTail(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
    } else {
      if (tail == null) {
        tail = newNode;
        head.setNextNode(tail);
      } else {
        tail.setNextNode(newNode);
        tail = newNode;
      }
    }
  }

  public void addAtIndex(int index, int val) {
    int i = 0;
    Node n = head;
    if (index == 0 && n == null) {
      addAtHead(val);
    } else {
      if (n != null) {
        while (i < index - 1 && n.nextNode != null) {
          i++;
          n = n.nextNode;
        }
        if (i == index - 1) {
          Node newNode = new Node(val);
          newNode.nextNode = n.nextNode;
          n.nextNode = newNode;
          if (newNode.nextNode == null) tail = newNode;
        }
      }
    }
  }

  public void deleteAtIndex(int index) {
    if (index == 0 && head != null) {
      head = head.nextNode;
    } else {
      int i = 0;
      Node n = head;
      if (n != null) {
        while (i < index - 1) {
          i++;
          if (n != null) n = n.nextNode;
        }
        if (i == index - 1 && n != null) {
          Node t = n.nextNode;
          if (t != null) {
            n.nextNode = t.nextNode;
            if (n.nextNode == null) tail = n;
          }
        }
      }
    }
  }

  class Node {
    private Node nextNode;
    private int value;

    Node(int value) {
      this.value = value;
    }

    private void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }
  }
}
