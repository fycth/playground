package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {
  @Test
  public void case1() {
    assertEquals("100", new AddBinary().addBinary("11","1"));
  }
  @Test
  public void case2() {
    assertEquals("10101", new AddBinary().addBinary("1010","1011"));
  }
  @Test
  public void case3() {
    assertEquals("11", new AddBinary().addBinary("11","0"));
  }
  @Test
  public void case4() {
    assertEquals("0", new AddBinary().addBinary("0","0"));
  }
  @Test
  public void case5() {
    assertEquals("1", new AddBinary().addBinary("1","0"));
  }
  @Test
  public void case6() {
    assertEquals("10", new AddBinary().addBinary("1","1"));
  }
  @Test
  public void case7() {
    assertEquals("110", new AddBinary().addBinary("11","11"));
  }
  @Test
  public void case8() {
    assertEquals("11110", new AddBinary().addBinary("1111","1111"));
  }
}
