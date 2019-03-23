package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeNode;

public class MaximumDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    if (root.left == null) return maxDepth(root.right) + 1;
    if (root.right == null) return maxDepth(root.left) + 1;
    int ldepth = maxDepth(root.left);
    int rdepth = maxDepth(root.right);
    int res = ldepth < rdepth ? rdepth : ldepth;
    return ++res;
  }
}
