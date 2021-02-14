package serhiienko.andrii.interviewcamp.chapter2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KadaneTest {
  @Test
  public void case1() {
    Kadane kadane = new Kadane();
    int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int expectedResult = 6;
    int actualResult = kadane.kadane(a);
    assertEquals(expectedResult, actualResult);
  }
}
