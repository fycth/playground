package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import static org.junit.Assert.assertEquals;

public class MaximumDepthOfBinaryTreeTest {
  @Test
  public void case1() {
    TreeNode t = new TreeNode(20);
    t.left = new TreeNode(15);
    t.right = new TreeNode(7);
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = t;

    assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
  }

  @Test
  public void case2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
  }

  @Test
  public void case3() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
  }
}
