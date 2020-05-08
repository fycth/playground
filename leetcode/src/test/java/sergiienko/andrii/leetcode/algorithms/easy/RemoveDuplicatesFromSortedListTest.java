package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedListTest {
  @Test
  public void case1() {
    ListNode listNode = new RemoveDuplicatesFromSortedList().fromArray(new int[]{1,1,2});
    listNode = new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    int[] actual = new RemoveDuplicatesFromSortedList().toArray(listNode);
    int[] expected = new int[]{1,2};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    ListNode listNode = new RemoveDuplicatesFromSortedList().fromArray(new int[]{1,1,2,3,3});
    listNode = new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    int[] actual = new RemoveDuplicatesFromSortedList().toArray(listNode);
    int[] expected = new int[]{1,2,3};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case3() {
    ListNode listNode = new RemoveDuplicatesFromSortedList().fromArray(new int[]{1});
    listNode = new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    int[] actual = new RemoveDuplicatesFromSortedList().toArray(listNode);
    int[] expected = new int[]{1};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case4() {
    ListNode listNode = new RemoveDuplicatesFromSortedList().fromArray(new int[]{1,2,3});
    listNode = new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    int[] actual = new RemoveDuplicatesFromSortedList().toArray(listNode);
    int[] expected = new int[]{1,2,3};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case5() {
    ListNode listNode = new RemoveDuplicatesFromSortedList().fromArray(new int[]{});
    listNode = new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    int[] actual = new RemoveDuplicatesFromSortedList().toArray(listNode);
    int[] expected = new int[]{};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
