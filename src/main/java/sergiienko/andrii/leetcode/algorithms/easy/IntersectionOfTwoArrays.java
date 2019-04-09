package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.*;

public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> res = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    for (int i : nums1) set1.add(i);
    Set<Integer> set2 = new HashSet<>();
    for (int i : nums2) set2.add(i);
    for (Integer n : set1) if (set2.contains(n)) res.add(n);
    return res.stream().mapToInt(i -> i).toArray();
  }
}
