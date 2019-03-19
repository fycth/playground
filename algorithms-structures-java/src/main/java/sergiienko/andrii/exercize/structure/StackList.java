package sergiienko.andrii.exercize.structure;

public class StackList<T> {
  private Node head;

  public void push(T value) {
    Node n = new Node(value);
    n.next = head;
    head = n;
  }

  public T peek() {
    if (head == null) {
      return null;
    }
    return head.value;
  }

  public T pop() {
    if (head == null) {
      return null;
    }
    T res = head.value;
    head = head.next;
    return res;
  }

  public boolean isEmpty() {
    return head == null;
  }

  class Node {
    Node(T value) {
      this.value = value;
    }
    Node next;
    T value;
  }
}
