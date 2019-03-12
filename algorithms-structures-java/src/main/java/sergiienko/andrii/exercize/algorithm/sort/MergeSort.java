package sergiienko.andrii.exercize.algorithm.sort;

public class MergeSort {

  public <T extends Comparable<T>> void sort(T[] input) {
    Object[] output = new Object[input.length];
    mergesort(input, output, 0, input.length - 1);
  }

  @SuppressWarnings("unchecked")
  private <T extends Comparable<T>> void mergesort(T[]input, Object[] output, int begin, int end) {
    if (begin >= end) return;
    int m = (end + begin) / 2;
    mergesort(input, output, begin, m);
    mergesort(input, output, m + 1, end);

    int li = begin;
    int ri = m + 1;
    int oi = li;
    while (li <= m && ri <= end) {
      if (input[li].compareTo(input[ri]) <= 0) {
        output[oi] = input[li];
        li++;
      } else {
        output[oi] = input[ri];
        ri++;
      }
      oi++;
    }
    for (int i = li; i <= m; i++) {
      output[oi] = input[i];
      oi++;
    }
    for (int i = ri; i <= end; i++) {
      output[oi] = input[i];
      oi++;
    }
    for (int i = begin; i <= end; i++) {
      input[i] = (T)(output[i]);
    }
  }
}
