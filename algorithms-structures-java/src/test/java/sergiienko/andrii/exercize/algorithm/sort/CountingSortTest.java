package sergiienko.andrii.exercize.algorithm.sort;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CountingSortTest extends TestHelper {
  @Test
  public void case1() {
    Integer[] input = new Integer[]{22,22,22,1,1,4,5};
    Integer[] expected = new Integer[]{1,1,4,5,22,22,22};
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new CountingSort().sort(actual, expected[expected.length - 1]);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
  @Test
  public void testRandomArray() {
    Integer[] input = generateRandomArray();
    Integer[] expected = new Integer[input.length];
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    System.arraycopy(input, 0, actual, 0, input.length);
    Arrays.sort(expected);
    new CountingSort().sort(actual, expected[expected.length - 1]);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }

  @Test
  public void testEmptyArray() {
    Integer[] input = new Integer[]{};
    new CountingSort().sort(input, 0);
    assertEquals(0, input.length);
  }

  @Test
  public void testTwoItemsArray() {
    Integer[] input = generateRandomArray(2);
    Integer[] expected = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    Arrays.sort(expected);
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new CountingSort().sort(actual, expected[expected.length - 1]);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }

  @Test
  public void testOneItemArray() {
    Integer[] input = generateRandomArray(1);
    Integer[] expected = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, actual, 0, input.length);
    new CountingSort().sort(actual, expected[expected.length - 1]);
    assertEquals(1, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
}
