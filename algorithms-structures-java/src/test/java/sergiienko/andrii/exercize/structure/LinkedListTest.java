package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import java.util.Arrays;

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
  public void testInsertSorted() {
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.insertSorted(i);
    }
    Arrays.sort(array);
    StringBuilder sb = new StringBuilder("{ ");
    for (Integer i : array) {
      sb.append(i).append(" ");
    }
    sb.append("}");
    assertEquals(sb.toString(), l.toString());
  }

  @Test
  public void testSort() {
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.insertAtHead(i);
    }
    l.sort();
    Arrays.sort(array);
    StringBuilder sb = new StringBuilder("{ ");
    for (Integer i : array) {
      sb.append(i).append(" ");
    }
    sb.append("}");
    assertEquals(sb.toString(), l.toString());

    l = new LinkedList<>();
    l.sort();
    assertEquals("{ }", l.toString());

    l = new LinkedList<>();
    l.insertAtHead(randomLength);
    l.sort();
    assertEquals("{ " + randomLength + " }", l.toString());

    l = new LinkedList<>();
    l.insertAtHead(randomLength);
    l.insertAtHead(randomLength);
    l.sort();
    assertEquals("{ " + randomLength + " " + randomLength + " }", l.toString());
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

  @Test
  public void testRemoveElement() {
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.insertAtHead(i);
    }
    int initialArrayLength = l.length();
    Integer randomElement = array[Math.abs(r.nextInt(randomLength - 1))];
    l.removeElement(randomElement);
    int newArrayLength = l.length();

    assertEquals(initialArrayLength - 1, newArrayLength);
    // the array contains unique elements, so the following test works
    assertNull(l.findElement(randomElement));
  }

  @Test
  public void testSorted() {
    LinkedList<Integer> l = new LinkedList<>();
    int randomLength = getRandomArrayLength();
    Integer[] array = generateRandomArray(randomLength);
    for (Integer i : array) {
      l.insertAtHead(i);
    }

    assertFalse(l.sorted());

    l.sort();

    assertTrue(l.sorted());
  }
}
