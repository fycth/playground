package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeNode;

public class PathSum {
  public boolean hasPathSum(TreeNode root, int sum) {
    return hasPathSum(root, sum, 0);
  }

  private boolean hasPathSum(TreeNode root, int sum, int currentsum) {
    if (root == null) return false;
    if (root.val + currentsum == sum && root.left == null && root.right == null) return true;
    if (hasPathSum(root.left, sum, currentsum + root.val)) return true;
    if (hasPathSum(root.right, sum, currentsum + root.val)) return true;
    return false;
  }
}
