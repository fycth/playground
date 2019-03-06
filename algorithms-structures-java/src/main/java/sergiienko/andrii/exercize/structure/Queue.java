package sergiienko.andrii.exercize.structure;

public class Queue<T> {
  Node head;
  Node tail;
  public void enqueue(T value) {
    Node n = new Node(value);
    if (head != null) {
      head.priv = n;
    }
    n.next = head;
    head = n;
    if (tail == null) {
      tail = head;
    }
  }
  public T dequeue() {
    T val = null;
    if (!isEmpty()) {
      Node t = tail.priv;
      val = tail.value;
      if (t != null) {
        t.next = null;
      } else {
        head = null;
      }
      tail.priv = null;
      tail = t;
    }
    return val;
  }
  public boolean isEmpty() {
    return head == null;
  }
  class Node {
    T value;
    Node next;
    Node priv;
    Node(T value) {
      this.value = value;
    }
  }
}
