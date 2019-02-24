package sergiienko.andrii.exercize.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class TestHelper {
  public static Integer[] generateRandomArray() {
    return generateRandomArray(100);
  }
  public static Integer[] generateRandomArray(int size) {
    Integer[] array = new Integer[size];
    for (int i = 0; i < size; i++) {
      array[i] = i;
    }
    Collections.shuffle(Arrays.asList(array));
    return array;
  }
}
