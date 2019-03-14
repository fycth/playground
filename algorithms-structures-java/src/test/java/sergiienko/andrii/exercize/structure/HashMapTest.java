package sergiienko.andrii.exercize.structure;

import org.junit.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class HashMapTest {
  @Test
  public void case1() {
    HashMap<String, String> hashMap = new HashMap<>();
    String expected = "Hello World !";
    hashMap.put("1", expected);
    String actual = hashMap.get("1");
    assertEquals(expected, actual);
  }
  @Test
  public void case2() {
    HashMap<String, String> hashMap = new HashMap<>();
    String expected = "Hello World !";
    hashMap.put("1", expected);
    assertEquals(expected, hashMap.get("1"));
    hashMap.put("1", "2");
    assertEquals("2", hashMap.get("1"));
  }
  @Test
  public void case3() {
    HashMap<String, String> hashMap = new HashMap<>();
    Map<String, String> m = new java.util.HashMap<>();
    Random r = new Random();
    for (int i = 10000; i >= 0; i--) {
      int key = r.nextInt(Integer.MAX_VALUE);
      int value = r.nextInt(Integer.MAX_VALUE);
      m.put(String.valueOf(key), String.valueOf(value));
      hashMap.put(String.valueOf(key), String.valueOf(value));
    }
    for (Map.Entry<String, String> entry : m.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      assertEquals(value, hashMap.get(key));
    }
  }
}