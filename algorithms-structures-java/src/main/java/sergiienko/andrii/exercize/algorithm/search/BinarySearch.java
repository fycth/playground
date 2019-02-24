package sergiienko.andrii.exercize.algorithm.search;

public class BinarySearch {
  public <T extends Comparable<T>> int search(T[] array, T element) {
    int right = array.length - 1;
    int left = 0;
    while (right >= left) {
      int middle = left + (right - left) / 2;
      if (element.compareTo(array[middle]) == 0) {
        return middle;
      }
      if (element.compareTo(array[middle]) > 0) {
        left = middle + 1;
      } else if (element.compareTo(array[middle]) < 0) {
        right = middle - 1;
      }
    }
    return -1;
  }
}
