package sergiienko.andrii.exercize.algorithm.sort;

public class BubbleSort {
  public <T extends Comparable<T>> void sort(T[] ints) {
    int l = ints.length;
    if (l == 0) {
      return;
    }
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < l - 1; i++) {
        if (ints[i].compareTo(ints[i + 1]) > 0) {
          T buffer = ints[i + 1];
          ints[i + 1] = ints[i];
          ints[i] = buffer;
          swapped = true;
        }
      }
      l--;
    } while (swapped);
  }
}
