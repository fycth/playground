package serhiienko.andrii.interviewcamp.chapter2;

/*

Kadano's algorithm: https://en.wikipedia.org/wiki/Maximum_subarray_problem
Given an array of integers that can be both +ve and -ve, find the contiguous subarraywith the largest sum.
For example:  [1,2,-1,2,-3,2,-5]  -> first 4 elements have the largest sum. Return 4

Questions to Clarify:

Q. How do you want the output?
A. Return the value of the maximum sum.

Q. Do empty arrays count as a subarray?
A. No, the subarray should have at least 1 element.

Q. But what if the input array is empty or null?
A. Throw an exception

*/

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
