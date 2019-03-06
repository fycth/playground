package sergiienko.andrii.exercize.structure;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class QueueTest {
  @Test
  public void case1() {
    Queue<Integer> queue = new Queue<>();
    assertTrue(queue.isEmpty());
    queue.enqueue(1);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    assertFalse(queue.isEmpty());
    assertEquals(new Integer(1), queue.dequeue());
    assertEquals(new Integer(1), queue.dequeue());
    assertEquals(new Integer(2), queue.dequeue());
    assertEquals(new Integer(3), queue.dequeue());
    assertEquals(new Integer(4), queue.dequeue());
    assertTrue(queue.isEmpty());
    assertNull(queue.dequeue());
  }
}
