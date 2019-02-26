package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import static org.junit.Assert.*;

public class LinkedListTest extends TestHelper {
  @Test
  public void testEmptyList() {
    LinkedList<Integer> l = new LinkedList<>();
    assertEquals(0, l.length());
  }

  @Test
  public void testRandomList() {
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    assertEquals(randomLength, l.length());
  }

  @Test
  public void testFindElement() {
    LinkedList<Integer> l = new LinkedList<>();
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
  public void testRemoveFromHead() {
    LinkedList<Integer> l = new LinkedList<>();
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
    LinkedList<Integer> l = new LinkedList<>();
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
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.appendToEnd(i);
    }
    l.removeFromEnd();
    assertEquals(randomLength - 1, l.length());
  }
}
