package sergiienko.andrii.exercize.structure;

public class LinkedList<T extends Comparable<T>>  {
  private Node head;

  public void appendToEnd(T value) {
    if (head == null) {
      head = new Node(value);
    } else {
      Node i = head;
      while (i.getNextNode() != null) {
        i = i.getNextNode();
      }
      i.setNextNode(new Node(value));
    }
  }

  public void insertAtHead(T value) {
    Node node = new Node(value);
    node.setNextNode(head);
    head = node;
  }

  public T findElement(T value) {
    Node i = head;
    while (i != null) {
      if (i.getValue().compareTo(value) == 0) {
        return value;
      }
      i = i.getNextNode();
    }
    return null;
  }

  public void removeFromHead() {
    if (head != null) {
      head = head.getNextNode();
    }
  }

  public void removeFromEnd() {
    if (head != null) {
      if (head.getNextNode() == null) {
        head = null;
      } else {
        Node h = head;
        Node t = head.getNextNode();
        while (t.getNextNode() != null) {
          h = t;
          t = h.getNextNode();
        }
        h.setNextNode(null);
      }
    }
  }

  public int length() {
    Node i = head;
    int l = 0;
    while (i != null) {
      l++;
      i = i.getNextNode();
    }
    return l;
  }

  @Override
  public String toString() {
    Node i = head;
    StringBuilder sb = new StringBuilder("{ ");
    while (i != null) {
      sb.append(i.toString()).append(" ");
      i = i.getNextNode();
    }
    sb.append("}");
    return sb.toString();
  }

  class Node {
    private Node nextNode;
    private T value;
    Node(T value) {
      this.value = value;
    }
    private void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }
    private Node getNextNode() {
      return nextNode;
    }
    private T getValue() {
      return value;
    }
    @Override
    public String toString() {
      return value.toString();
    }
  }
}
