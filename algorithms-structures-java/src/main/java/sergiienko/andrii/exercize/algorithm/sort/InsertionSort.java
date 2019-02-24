package sergiienko.andrii.exercize.algorithm.sort;

public class InsertionSort {
  public <T extends Comparable<T>> void sort(T[] ints) {
    for (int i = 0; i < ints.length - 1; i++) {
      int j = i + 1;
      while (j > 0 && ints[j].compareTo(ints[j-1]) < 0) {
        T buffer = ints[j-1];
        ints[j-1] = ints[j];
        ints[j] = buffer;
        j--;
      }
    }
  }
}
