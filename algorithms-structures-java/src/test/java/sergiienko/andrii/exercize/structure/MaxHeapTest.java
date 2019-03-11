package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxHeapTest extends TestHelper {
  @Test
  public void testRandomArray() {
    Integer[] input = generateRandomArray();
    Integer[] expected = new Integer[input.length];
    System.arraycopy(input, 0, expected, 0, input.length);
    Arrays.sort(expected);
    MaxHeap heap = new MaxHeap(input);
    heap.sort();
    Integer[] actual = heap.getHeapAsArray();
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expected[i]);
    }
  }
}
