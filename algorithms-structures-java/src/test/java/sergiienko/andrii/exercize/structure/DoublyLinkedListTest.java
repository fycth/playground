package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.algorithm.TestHelper;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest {
  @Test
  public void testEmptyList() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    assertEquals(0, l.length());
  }

  @Test
  public void testRandomList() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    assertEquals(randomLength, l.length());
  }

  @Test
  public void testFindElement() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    Integer expectedElement = array[r.nextInt(randomLength - 1)];
    Integer actualElement = l.findElement(expectedElement);
    assertEquals(expectedElement, actualElement);
  }

  @Test
  public void testFindElementFromEnd() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    Integer expectedElement = array[r.nextInt(randomLength - 1)];
    l.insertAtHead(expectedElement);
    Integer actualElement = l.findElementFromEnd(expectedElement);
    assertEquals(expectedElement, actualElement);
  }
  
  @Test
  public void testRemoveFromHead() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.removeFromHead();
    assertEquals(randomLength - 1, l.length());
  }

  @Test
  public void testInsertAtHead() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.insertAtHead(r.nextInt());
    assertEquals(randomLength + 1, l.length());
  }

  @Test
  public void testRemoveFromEnd() {
    Random r = new Random();
    int randomLength = r.nextInt(100);
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    Integer[] array = TestHelper.generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.removeFromEnd();
    assertEquals(randomLength - 1, l.length());
  }
}
