package sergiienko.andrii.exercize;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestHelper {
  private static final int DEFAULT_ARRAY_SIZE = 100;
  protected static final Random r = new Random();
  protected Integer[] generateRandomArray() {
    return generateRandomArray(DEFAULT_ARRAY_SIZE);
  }
  protected Integer[] generateRandomArray(int size) {
    Integer[] array = new Integer[size];
    for (int i = 0; i < size; i++) {
      array[i] = i;
    }
    Collections.shuffle(Arrays.asList(array));
    return array;
  }
  protected int getRandomArrayLength() {
    return Math.abs(r.nextInt(DEFAULT_ARRAY_SIZE - 1)) + 1;
  }
}
