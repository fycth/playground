package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class RemoveLinkedListElementTest {
  @Test
  public void case1() {
    ListNode listNode = new RemoveLinkedListElement().fromArray(new int[]{1,2,6,3,4,5,6});
    listNode = new RemoveLinkedListElement().removeElements(listNode, 6);
    int[] actual = new RemoveLinkedListElement().toArray(listNode);
    int[] expected = new int[]{1,2,3,4,5};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    ListNode listNode = new RemoveLinkedListElement().fromArray(new int[]{1,1,2,3,3});
    listNode = new RemoveLinkedListElement().removeElements(listNode, 10);
    int[] actual = new RemoveLinkedListElement().toArray(listNode);
    int[] expected = new int[]{1,1,2,3,3};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case3() {
    ListNode listNode = new RemoveLinkedListElement().fromArray(new int[]{1});
    listNode = new RemoveLinkedListElement().removeElements(listNode, 1);
    int[] actual = new RemoveLinkedListElement().toArray(listNode);
    int[] expected = new int[]{};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case4() {
    ListNode listNode = new RemoveLinkedListElement().fromArray(new int[]{});
    listNode = new RemoveLinkedListElement().removeElements(listNode, 2);
    int[] actual = new RemoveLinkedListElement().toArray(listNode);
    int[] expected = new int[]{};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case5() {
    ListNode listNode = new RemoveLinkedListElement().fromArray(new int[]{1,1});
    listNode = new RemoveLinkedListElement().removeElements(listNode, 1);
    int[] actual = new RemoveLinkedListElement().toArray(listNode);
    int[] expected = new int[]{};
    assertEquals(expected.length, actual.length);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
