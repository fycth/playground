package serhiienko.andrii.interviewcamp.chapter2;

public class Kadane {
  public int kadane(int[] a) {
    if (a == null || a.length == 0) {
      throw new IllegalArgumentException("Input array is empty or null");
    }
    int maximumSum = a[0];
    int maximumEnding = a[0];
    for (int i = 1; i < a.length; i++) {
      maximumEnding = Math.max(maximumEnding + a[i], a[i]);
      maximumSum = Math.max(maximumSum, maximumEnding);
    }
    return maximumSum;
  }
}
