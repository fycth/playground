package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignLinkedListTest {
  @Test
  public void case1() {
    DesignLinkedList list = new DesignLinkedList();
    list.addAtHead(1);
    list.addAtTail(3);
    list.addAtIndex(1, 2);
    assertEquals(2, list.get(1));
    list.deleteAtIndex(1);
    assertEquals(3, list.get(1));
  }

  @Test
  public void case2() {
    DesignLinkedList list = new DesignLinkedList();
    assertEquals(-1, list.get(0));
    list.addAtIndex(1, 2);
    assertEquals(-1, list.get(0));
    assertEquals(-1, list.get(1));
    list.addAtIndex(0, 1);
    assertEquals(1, list.get(0));
    assertEquals(-1, list.get(1));
  }

  @Test
  public void case3() {
    DesignLinkedList list = new DesignLinkedList();
    list.addAtHead(5);
    list.addAtHead(2);
    list.deleteAtIndex(1);
    list.addAtIndex(1, 9);
    list.addAtHead(4);
    list.addAtHead(9);
    list.addAtHead(8);
    assertEquals(2, list.get(3));
    list.addAtTail(1);
    list.addAtIndex(3, 6);
    list.addAtHead(3);
  }

  @Test
  public void case4() {
    DesignLinkedList list = new DesignLinkedList();
    list.addAtHead(7);
    list.addAtHead(2);
    list.addAtHead(1);
    list.addAtIndex(3, 0);
    list.deleteAtIndex(2);
    list.addAtHead(6);
    list.addAtTail(4);
    assertEquals(4, list.get(4));
    list.addAtHead(4);
    list.addAtIndex(5, 0);
    list.addAtHead(6);
  }

  @Test
  public void case5() {
    DesignLinkedList list = new DesignLinkedList();
    list.addAtHead(4);
    assertEquals(-1, list.get(1));
    list.addAtHead(7);
    list.addAtTail(1);
    list.addAtIndex(1, 7);
    assertEquals(-1, list.get(4));
    assertEquals(1, list.get(3));
    list.addAtHead(2);
    list.addAtIndex(4, 1);
    list.deleteAtIndex(3);
    list.addAtHead(7);
  }
}
