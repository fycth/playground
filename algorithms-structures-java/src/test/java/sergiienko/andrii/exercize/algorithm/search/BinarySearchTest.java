package sergiienko.andrii.exercize.algorithm.search;

import org.junit.Test;
import sergiienko.andrii.exercize.algorithm.TestHelper;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class BinarySearchTest {
  @Test
  public void testRandomSearch() {
    Integer[] input = TestHelper.generateRandomArray();
    Arrays.sort(input);
    Random r = new Random();
    Integer n = r.nextInt();
    int expectedIndexOf = Arrays.asList(input).indexOf(n);
    int actualIndexOf = new BinarySearch().search(input, n);
    assertEquals(expectedIndexOf, actualIndexOf);
  }

  @Test
  public void testPredefinedSearch() {
    Integer[] input = TestHelper.generateRandomArray();
    Arrays.sort(input);
    Random r = new Random();
    int randomIndex = r.nextInt(input.length - 1);
    Integer n = input[randomIndex];
    int expectedIndexOf = Arrays.asList(input).indexOf(n);
    int actualIndexOf = new BinarySearch().search(input, n);
    assertEquals(expectedIndexOf, actualIndexOf);
  }

  @Test
  public void testLowerBoundSearch() {
    Integer[] input = TestHelper.generateRandomArray();
    Arrays.sort(input);
    Integer n = input[0];
    int expectedIndexOf = Arrays.asList(input).indexOf(n);
    int actualIndexOf = new BinarySearch().search(input, n);
    assertEquals(expectedIndexOf, actualIndexOf);
  }

  @Test
  public void testUpperBoundSearch() {
    Integer[] input = TestHelper.generateRandomArray();
    Arrays.sort(input);
    Integer n = input[input.length - 1];
    int expectedIndexOf = Arrays.asList(input).indexOf(n);
    int actualIndexOf = new BinarySearch().search(input, n);
    assertEquals(expectedIndexOf, actualIndexOf);
  }
}
