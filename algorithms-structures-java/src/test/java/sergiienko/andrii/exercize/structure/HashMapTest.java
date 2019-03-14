package sergiienko.andrii.exercize.structure;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
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
  @Test
  public void case4() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("1", "Hello World !");
    assertEquals("Hello World !", hashMap.get("1"));
    hashMap.put("1", "2");
    assertEquals("2", hashMap.get("1"));
    hashMap.put("22", "12");
    assertEquals("12", hashMap.get("22"));
    hashMap.remove("22");
    assertNull(hashMap.get("22"));
    hashMap.remove("2");
    assertNull(hashMap.get("2"));
  }
  @Test
  public void case5() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("key1", "value1");
    hashMap.put("hello", "world");
    assertEquals("{ (hello => world) (key1 => value1) }", hashMap.toString());
  }
  @Test
  public void case6() {
    assertEquals("{ }", new HashMap<>().toString());
  }
  @Test
  public void case7() {
    assertEquals(0, new HashMap<>().getKeys().size());
    assertEquals(0, new HashMap<>().getValues().size());
  }
  @Test
  public void case8() {
    HashMap<String, String> hashMap = new HashMap<>();
    Map<String, String> m = new java.util.HashMap<>();
    Random r = new Random();
    for (int i = 1000; i >= 0; i--) {
      int key = r.nextInt(Integer.MAX_VALUE);
      int value = r.nextInt(Integer.MAX_VALUE);
      m.put(String.valueOf(key), String.valueOf(value));
      hashMap.put(String.valueOf(key), String.valueOf(value));
    }
    List<String> keys = hashMap.getKeys();
    List<String> values = hashMap.getValues();
    for (Map.Entry<String, String> entry : m.entrySet()) {
      assertTrue(keys.contains(entry.getKey()));
      assertTrue(values.contains(entry.getValue()));
    }
  }
}
