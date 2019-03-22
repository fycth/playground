package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest {
  @Test
  public void case1() {
    assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
  }

  @Test
  public void case2() {
    assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1}));
  }
}
