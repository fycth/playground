package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {
  @Test
  public void case1() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }
  @Test
  public void case2() {
    MinStack minStack = new MinStack();
    minStack.push(2147483646);
    minStack.push(2147483646);
    minStack.push(2147483647);
    assertEquals(2147483647, minStack.top());
    minStack.pop();
    assertEquals(2147483646, minStack.getMin());
    minStack.pop();
    assertEquals(2147483646, minStack.getMin());
    minStack.pop();
    minStack.push(2147483647);
    assertEquals(2147483647, minStack.top());
    assertEquals(2147483647, minStack.getMin());
    minStack.push(-2147483648);
    assertEquals(-2147483648, minStack.top());
    assertEquals(-2147483648, minStack.getMin());
    minStack.pop();
    assertEquals(2147483647, minStack.getMin());
  }
}
