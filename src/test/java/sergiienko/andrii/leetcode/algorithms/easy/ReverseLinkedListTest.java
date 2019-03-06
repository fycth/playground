package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {
  @Test
  public void case1() {
    ReverseLinkedList.ListNode listNode = new ReverseLinkedList().fromArray(new int[]{1,2,6,3,4,5,6});
    listNode = new ReverseLinkedList().reverseList(listNode);
    int[] actual = new ReverseLinkedList().toArray(listNode);
    int[] expected = new int[]{6,5,4,3,6,2,1};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
