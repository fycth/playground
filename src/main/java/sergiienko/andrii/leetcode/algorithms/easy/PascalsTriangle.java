package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    for (int n = 0; n < numRows; n++) {
      if (res.isEmpty()) {
        res.add(new ArrayList<>(Collections.singletonList(1)));
      } else {
        List<Integer> li = res.get(res.size() - 1);
        if (li.size() == 1) {
          res.add(new ArrayList<>(Arrays.asList(1,1)));
        } else {
          List<Integer> l = new ArrayList<>();
          l.add(1);
          for (int i = 0; i + 1 < li.size(); i++) {
            l.add(li.get(i) + li.get(i + 1));
          }
          l.add(1);
          res.add(l);
        }
      }
    }
    return res;
  }
}
