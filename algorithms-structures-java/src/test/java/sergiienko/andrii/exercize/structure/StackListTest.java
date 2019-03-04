package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackListTest extends TestHelper {
  @Test
  public void testEmptyStack() {
    StackList<Integer> stack = new StackList<>();
    assertTrue(stack.isEmpty());
  }
  @Test
  public void testNonEmptyStack() {
    StackList<Integer> stack = new StackList<>();
    stack.push(getRandomArrayLength());
    assertFalse(stack.isEmpty());
  }
  @Test
  public void testPeek() {
    StackList<Integer> stack = new StackList<>();
    Integer r = getRandomArrayLength();
    stack.push(r);
    assertFalse(stack.isEmpty());
    assertEquals(r, stack.peek());
    assertFalse(stack.isEmpty());
  }
  @Test
  public void testPop() {
    StackList<Integer> stack = new StackList<>();
    Integer r = getRandomArrayLength();
    stack.push(r);
    assertEquals(r, stack.pop());
    assertTrue(stack.isEmpty());
    assertNull(stack.pop());
  }
}
