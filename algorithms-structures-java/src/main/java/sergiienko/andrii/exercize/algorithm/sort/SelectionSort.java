package sergiienko.andrii.exercize.algorithm.sort;

public class SelectionSort {
  public <T extends Comparable<T>> void sort(T[] ints) {
    if (ints.length > 1) {
      for (int n = 0; n < ints.length - 1; n++) {
        int smallest = n;
        for (int m = n + 1; m < ints.length; m++) {
          if (ints[m].compareTo(ints[smallest]) < 0) {
            smallest = m;
          }
        }
        T buffer = ints[n];
        ints[n] = ints[smallest];
        ints[smallest] = buffer;
      }
    }
  }
}