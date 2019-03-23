package sergiienko.andrii.leetcode.helpers;

import java.util.ArrayList;
import java.util.List;

public class TreeHelper {
  public List<Integer> toList(TreeNode root) {
    List<Integer> l = new ArrayList<>();
    if (root != null) {
      l.add(root.val);
      toList(root, l);
    }
    return l;
  }

  private void toList(TreeNode root, List<Integer> l) {
    if (root.left != null) {
      l.add(root.left.val);
    } else {
      l.add(null);
    }
    if (root.right != null) {
      l.add(root.right.val);
    } else {
      l.add(null);
    }
    if (root.left != null) toList(root.left, l);
    if (root.right != null) toList(root.right, l);
  }
}
