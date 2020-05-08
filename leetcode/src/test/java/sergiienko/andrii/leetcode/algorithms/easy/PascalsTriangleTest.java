package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest {
  @Test
  public void case1() {
    List<List<Integer>> expectedList = new ArrayList<>();
    expectedList.add(new ArrayList<>(Collections.singletonList(1)));
    expectedList.add(new ArrayList<>(Arrays.asList(1,1)));
    expectedList.add(new ArrayList<>(Arrays.asList(1,2,1)));
    expectedList.add(new ArrayList<>(Arrays.asList(1,3,3,1)));
    expectedList.add(new ArrayList<>(Arrays.asList(1,4,6,4,1)));

    List<List<Integer>> actualList = new PascalsTriangle().generate(5);

    for (int i = 0; i < actualList.size(); i++) {
      List<Integer> el = expectedList.get(i);
      List<Integer> al = actualList.get(i);
      for (int j = 0; j < el.size(); j++) {
        assertEquals(el.get(j), al.get(j));
      }
    }
  }
}
