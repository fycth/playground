package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeNode;

public class MinimumDepthOfBinaryTree {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    if (root.left == null) return minDepth(root.right) + 1;
    if (root.right == null) return minDepth(root.left) + 1;
    int ldepth = minDepth(root.left);
    int rdepth = minDepth(root.right);
    int res = ldepth < rdepth ? ldepth : rdepth;
    return ++res;
  }
}
