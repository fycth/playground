package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesignHashMapTest {
  @Test
  public void case1() {
    DesignHashMap map = new DesignHashMap();
    map.put(1, 1);
    map.put(2, 2);
    assertEquals(1, map.get(1));
    assertEquals(-1, map.get(3));
    map.put(2, 1);
    assertEquals(1, map.get(2));
    map.remove(2);
    assertEquals(-1, map.get(2));
  }
}
