package sergiienko.andrii.exercize.structure;

import org.junit.Test;

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
}
