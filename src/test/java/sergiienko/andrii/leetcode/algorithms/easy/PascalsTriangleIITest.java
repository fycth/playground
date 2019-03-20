package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleIITest {
  @Test
  public void case1() {
    List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,3,3,1));
    List<Integer> actualList = new PascalsTriangleII().getRow(3);
    for (int j = 0; j < expectedList.size(); j++) {
      assertEquals(expectedList.get(j), actualList.get(j));
    }
  }
  @Test
  public void case2() {
    List<Integer> expectedList = new ArrayList<>(Collections.singletonList(1));
    List<Integer> actualList = new PascalsTriangleII().getRow(0);
    for (int j = 0; j < expectedList.size(); j++) {
      assertEquals(expectedList.get(j), actualList.get(j));
    }
  }
  @Test
  public void case3() {
    List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,1));
    List<Integer> actualList = new PascalsTriangleII().getRow(1);
    for (int j = 0; j < expectedList.size(); j++) {
      assertEquals(expectedList.get(j), actualList.get(j));
    }
  }
  @Test
  public void case4() {
    List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1));
    List<Integer> actualList = new PascalsTriangleII().getRow(30);
    for (int j = 0; j < expectedList.size(); j++) {
      assertEquals(expectedList.get(j), actualList.get(j));
    }
  }
}
