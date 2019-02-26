package sergiienko.andrii.exercize.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
  @Test
  public void testRandomArray() {
    Random r = new Random();
    int arraySize = r.nextInt(100);
    Integer[] input = new Integer[arraySize];
    Integer[] expected = new Integer[arraySize];
    Integer[] actual = new Integer[arraySize];
    for (int i = 0; i < input.length; i++) {
      input[i] = r.nextInt(100);
    }
    System.arraycopy(input, 0, expected, 0, input.length);
    System.arraycopy(input, 0, actual, 0, input.length);
    Arrays.sort(expected);
    new BubbleSort().sort(actual);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }

  @Test
  public void testEmptyArray() {
    Integer[] input = new Integer[]{};
    new BubbleSort().sort(input);
    assertEquals(0, input.length);
  }

  @Test
  public void testTwoItemsArray() {
    Random r = new Random();
    Integer[] input = new Integer[2];
    Integer[] expected = new Integer[2];
    for (int i = 0; i < input.length; i++) {
      input[i] = r.nextInt(100);
    }
    System.arraycopy(input, 0, expected, 0, input.length);
    Arrays.sort(expected);
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new BubbleSort().sort(actual);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }

  @Test
  public void testOneItemArray() {
    Random r = new Random();
    Integer[] input = new Integer[]{r.nextInt()};
    Integer[] expected = new Integer[1];
    System.arraycopy(input, 0, expected, 0, input.length);
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new BubbleSort().sort(actual);
    assertEquals(1, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
}
