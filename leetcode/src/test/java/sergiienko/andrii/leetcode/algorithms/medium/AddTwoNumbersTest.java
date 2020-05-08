package sergiienko.andrii.leetcode.algorithms.medium;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.ListNode;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {
  @Test
  public void case1() {
    ListNode listNodeA = new AddTwoNumbers().fromArray(new int[]{2,4,3});
    ListNode listNodeB = new AddTwoNumbers().fromArray(new int[]{5,6,4});
    ListNode listNodeExpected = new AddTwoNumbers().fromArray(new int[]{7,0,8});
    ListNode listNodeActual = new AddTwoNumbers().addTwoNumbers(listNodeA, listNodeB);

    int[] actual = new AddTwoNumbers().toArray(listNodeActual);
    int[] expected = new AddTwoNumbers().toArray(listNodeExpected);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
  @Test
  public void case2() {
    ListNode listNodeA = new AddTwoNumbers().fromArray(new int[]{5});
    ListNode listNodeB = new AddTwoNumbers().fromArray(new int[]{5});
    ListNode listNodeExpected = new AddTwoNumbers().fromArray(new int[]{0,1});
    ListNode listNodeActual = new AddTwoNumbers().addTwoNumbers(listNodeA, listNodeB);

    int[] actual = new AddTwoNumbers().toArray(listNodeActual);
    int[] expected = new AddTwoNumbers().toArray(listNodeExpected);
    int i = 0;
    while (i < expected.length) {
      assertEquals(expected[i], actual[i]);
      i++;
    }
  }
}
