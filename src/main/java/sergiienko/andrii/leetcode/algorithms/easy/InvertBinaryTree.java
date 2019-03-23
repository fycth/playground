package sergiienko.andrii.leetcode.algorithms.easy;

import sergiienko.andrii.leetcode.helpers.TreeHelper;
import sergiienko.andrii.leetcode.helpers.TreeNode;

public class InvertBinaryTree extends TreeHelper {
  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      TreeNode n = root.left;
      root.left = root.right;
      root.right = n;
      if (root.left != null) invertTree(root.left);
      if (root.right != null) invertTree(root.right);
    }
    return root;
  }
}
