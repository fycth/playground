package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeNode;

public class SumOfLeftLeaves {
  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0;
    if (root.left != null && (root.left.left == null && root.left.right == null)) return root.left.val + sumOfLeftLeaves(root.right);
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }
}
