package sergiienko.andrii.leetcode.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapNodesInPairsTest {
  @Test
  public void case1() {
    SwapNodesInPairs.ListNode listNode = new SwapNodesInPairs().fromArray(new int[]{1,2,3,4});
    listNode = new SwapNodesInPairs().swapPairs(listNode);
    int[] actual = new SwapNodesInPairs().toArray(listNode);
    int[] expected = new int[]{2,1,4,3};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    SwapNodesInPairs.ListNode listNode = new SwapNodesInPairs().fromArray(new int[]{1,2,3});
    listNode = new SwapNodesInPairs().swapPairs(listNode);
    int[] actual = new SwapNodesInPairs().toArray(listNode);
    int[] expected = new int[]{2,1,3};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case3() {
    SwapNodesInPairs.ListNode listNode = new SwapNodesInPairs().fromArray(new int[]{1,2});
    listNode = new SwapNodesInPairs().swapPairs(listNode);
    int[] actual = new SwapNodesInPairs().toArray(listNode);
    int[] expected = new int[]{2,1};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case4() {
    SwapNodesInPairs.ListNode listNode = new SwapNodesInPairs().fromArray(new int[]{1});
    listNode = new SwapNodesInPairs().swapPairs(listNode);
    int[] actual = new SwapNodesInPairs().toArray(listNode);
    int[] expected = new int[]{1};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case5() {
    SwapNodesInPairs.ListNode listNode = new SwapNodesInPairs().fromArray(new int[]{1,2,3,4,5});
    listNode = new SwapNodesInPairs().swapPairs(listNode);
    int[] actual = new SwapNodesInPairs().toArray(listNode);
    int[] expected = new int[]{2,1,4,3,5};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
