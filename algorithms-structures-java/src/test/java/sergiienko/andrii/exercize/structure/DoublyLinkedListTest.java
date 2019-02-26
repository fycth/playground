package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest extends TestHelper {
  @Test
  public void testEmptyList() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    assertEquals(0, l.length());
  }

  @Test
  public void testRandomList() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    assertEquals(randomLength, l.length());
  }

  @Test
  public void testFindElement() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    Integer expectedElement = array[Math.abs(r.nextInt(randomLength - 1))];
    Integer actualElement = l.findElement(expectedElement);
    assertEquals(expectedElement, actualElement);
  }

  @Test
  public void testFindElementFromEnd() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    Integer expectedElement = array[Math.abs(r.nextInt(randomLength - 1))];
    l.insertAtHead(expectedElement);
    Integer actualElement = l.findElementFromEnd(expectedElement);
    assertEquals(expectedElement, actualElement);
  }
  
  @Test
  public void testRemoveFromHead() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.removeFromHead();
    assertEquals(randomLength - 1, l.length());
  }

  @Test
  public void testInsertAtHead() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.insertAtHead(Math.abs(r.nextInt()));
    assertEquals(randomLength + 1, l.length());
  }

  @Test
  public void testRemoveFromEnd() {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.removeFromEnd();
    assertEquals(randomLength - 1, l.length());
  }
}
