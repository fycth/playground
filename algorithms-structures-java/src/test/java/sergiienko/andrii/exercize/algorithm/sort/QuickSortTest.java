package sergiienko.andrii.exercize.algorithm.sort;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest extends TestHelper {
  @Test
  public void case1() {
    Integer[] input = new Integer[]{2,1};
    Integer[] expected = new Integer[input.length];
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    System.arraycopy(input, 0, actual, 0, input.length);
    Arrays.sort(expected);
    new QuickSort().sort(actual);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
  @Test
  public void case2() {
    Integer[] input = new Integer[]{1,2};
    Integer[] expected = new Integer[input.length];
    Integer[] actual = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    System.arraycopy(input, 0, actual, 0, input.length);
    Arrays.sort(expected);
    new QuickSort().sort(actual);
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
    new QuickSort().sort(actual);
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }

  @Test
  public void testEmptyArray() {
    Integer[] input = new Integer[]{};
    new QuickSort().sort(input);
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
    new QuickSort().sort(actual);
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
    new QuickSort().sort(actual);
    assertEquals(1, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
}
