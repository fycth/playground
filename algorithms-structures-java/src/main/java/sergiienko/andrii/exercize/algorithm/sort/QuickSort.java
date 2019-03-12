package sergiienko.andrii.exercize.algorithm.sort;

public class QuickSort {
  public <T extends Comparable<T>> void sort(T[] input) {
    quickSort(input, 0, input.length - 1);
  }
  private <T extends Comparable<T>> void quickSort(T[] ints, int begin, int end) {
    if (begin >= end) return;
    T pivot = ints[begin];
    int l = begin;
    int h = end;
    while (true) {
      while (ints[h].compareTo(pivot) >= 0 && h > l) h--;
      if (h <= l) ints[l] = pivot;
      else ints[l] = ints[h];
      l++;
      while (ints[l].compareTo(pivot) < 0 && l < h) l++;
      if (l >= h ) {
        l = h;
        ints[h] = pivot;
      }
      ints[h] = ints[l];
      quickSort(ints, begin, l - 1);
      quickSort(ints, l + 1, end);
      if (l >= h) break;
    }
  }
}
