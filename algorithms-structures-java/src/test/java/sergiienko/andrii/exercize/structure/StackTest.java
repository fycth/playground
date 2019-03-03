package sergiienko.andrii.exercize.structure;

import org.junit.Test;
import sergiienko.andrii.exercize.TestHelper;

import static org.junit.Assert.*;

public class StackTest extends TestHelper {
  @Test
  public void testEmptyStack() {
    Integer r = getRandomArrayLength();
    Stack<Integer> stack = new Stack<>(r);
    assertTrue(stack.isEmpty());
    stack.push(r);
    assertFalse(stack.isEmpty());
    assertEquals(r, stack.peek());
    assertFalse(stack.isEmpty());
    assertEquals(r, stack.pop());
    assertTrue(stack.isEmpty());
    assertNull(stack.pop());
    for (int i = 0; i < r; i++) {
      stack.push(getRandomArrayLength());
    }
    assertNull(stack.push(getRandomArrayLength()));
  }
}
