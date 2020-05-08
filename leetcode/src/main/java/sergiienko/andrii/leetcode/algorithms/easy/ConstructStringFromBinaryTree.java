package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeNode;

public class ConstructStringFromBinaryTree {
  public String tree2str(TreeNode t) {
    StringBuilder sb = new StringBuilder();
    if (null != t) {
      sb.append(t.val);
      if (t.left != null || t.right != null) sb.append("(");
      if (t.left != null) sb.append(tree2str(t.left));
      if (t.left != null || t.right != null) sb.append(")");
      if (t.right != null) sb.append("(").append(tree2str(t.right)).append(")");
    }
    return sb.toString();
  }
}
