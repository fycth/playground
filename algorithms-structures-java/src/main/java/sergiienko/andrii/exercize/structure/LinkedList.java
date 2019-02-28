package sergiienko.andrii.exercize.structure;

public class LinkedList<T extends Comparable<T>> {
  private Node head;

  public void insertSorted(T value) {
    Node newNode = new Node(value);
    Node leftNode = null;
    Node currentNode = head;
    while (currentNode != null && currentNode.getValue().compareTo(value) < 0) {
      leftNode = currentNode;
      currentNode = currentNode.getNextNode();
    }
    newNode.setNextNode(currentNode);
    if (leftNode != null) {
      leftNode.setNextNode(newNode);
    } else {
      head = newNode;
    }
  }

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

  public void sort() {
    Node h = null;
    while (head != null) {
      Node current = head;
      head = head.getNextNode();
      if (h == null || current.getValue().compareTo(h.getValue()) < 0) {
        current.setNextNode(h);
        h = current;
      } else {
        Node p = h;
        while (true) {
          if (p.getNextNode() == null || current.getValue().compareTo(p.getNextNode().getValue()) < 0) {
            current.setNextNode(p.getNextNode());
            p.setNextNode(current);
            break;
          }
          p = p.getNextNode();
        }
      }
    }
    head = h;
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
