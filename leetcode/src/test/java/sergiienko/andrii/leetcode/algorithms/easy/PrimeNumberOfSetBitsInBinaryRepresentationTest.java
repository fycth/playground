package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberOfSetBitsInBinaryRepresentationTest {
  @Test
  public void case1() {
    assertEquals(4, new PrimeNumberOfSetBitsInBinaryRepresentation().countPrimeSetBits(6, 10));
  }

  @Test
  public void case2() {
    assertEquals(5, new PrimeNumberOfSetBitsInBinaryRepresentation().countPrimeSetBits(10, 15));
  }
}
