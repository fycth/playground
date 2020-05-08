package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleII {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>(Collections.singletonList(1));
    for (int i = 0; i < rowIndex; i++) {
      row.add((int)((long)(row.get(i)) * (long)((rowIndex - i)) / (long)((i + 1))));
    }
    return row;
  }
}
