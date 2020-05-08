package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import static org.junit.Assert.assertEquals;

public class ConstructStringFromBinaryTreeTest {
  @Test
  public void case1() {
    TreeNode t = new TreeNode(2);
    t.left = new TreeNode(4);
    TreeNode root = new TreeNode(1);
    root.left = t;
    root.right = new TreeNode(3);

    assertEquals("1(2(4))(3)", new ConstructStringFromBinaryTree().tree2str(root));
  }

  @Test
  public void case2() {
    TreeNode t = new TreeNode(2);
    t.right = new TreeNode(4);
    TreeNode root = new TreeNode(1);
    root.left = t;
    root.right = new TreeNode(3);

    assertEquals("1(2()(4))(3)", new ConstructStringFromBinaryTree().tree2str(root));
  }
}
