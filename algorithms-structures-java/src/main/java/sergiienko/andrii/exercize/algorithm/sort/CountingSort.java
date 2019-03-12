package sergiienko.andrii.exercize.algorithm.sort;

public class CountingSort {
  public void sort(Integer[] input, int maxNumber) {
    int[] counts = new int[maxNumber + 1];
    for (int i : input) counts[i]++;
    int n = 0;
    for (int i = 0; i <= maxNumber; i++) {
      for (int l = 0; l < counts[i]; l++) {
        input[n] = i;
        n++;
      }
    }
  }
}
