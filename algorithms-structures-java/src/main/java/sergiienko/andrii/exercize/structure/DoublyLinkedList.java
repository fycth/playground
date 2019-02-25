package sergiienko.andrii.exercize.structure;

public class DoublyLinkedList<T extends Comparable<T>> {
  private Node head;
  private Node tail;

  public void insertAtHead(T value) {
    Node newNode = new Node(value);
    newNode.setNextNode(head);
    if (head != null) {
      head.setPreviousNode(newNode);
    }
    head = newNode;
  }

  public void appendToEnd(T value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    }
    if (tail != null) {
      tail.setNextNode(newNode);
      newNode.setPreviousNode(tail);
    }
    tail = newNode;
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
      head.setPreviousNode(null);
    }
  }

  public void removeFromEnd() {
    if (head != null) {
      if (head.equals(tail)) {
        head = null;
        tail = null;
      } else {
        Node newTail = tail.getPreviousNode();
        tail.setPreviousNode(null);
        newTail.setNextNode(null);
        tail = newTail;
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
    private Node previousNode;
    private T value;

    Node(T value) {
      this.value = value;
    }

    private void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }

    private void setPreviousNode(Node previousNode) {
      this.previousNode = previousNode;
    }

    private Node getNextNode() {
      return nextNode;
    }

    private Node getPreviousNode() {
      return previousNode;
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
