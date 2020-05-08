package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import static junit.framework.TestCase.assertTrue;

public class PathSumTest {
  @Test
  public void case1() {
    TreeNode t = new TreeNode(11);
    t.left = new TreeNode(7);
    t.right = new TreeNode(2);
    TreeNode root = new TreeNode(4);
    root.left = t;
    t = new TreeNode(5);
    t.left = root;
    root = t;
    t = new TreeNode(4);
    t.right = new TreeNode(1);
    TreeNode t2 = new TreeNode(8);
    t2.left = new TreeNode(13);
    t2.right = t;
    root.right = t2;

    assertTrue(new PathSum().hasPathSum(root, 22));
  }

  @Test
  public void case2() {
    TreeNode root = new TreeNode(-2);
    root.right = new TreeNode(-3);

    assertTrue(new PathSum().hasPathSum(root, -5));
  }

  @Test
  public void case3() {
    TreeNode root = new TreeNode(8);
    root.left = new TreeNode(9);
    TreeNode t = new TreeNode(-6);
    t.left = new TreeNode(5);
    t.right = new TreeNode(9);
    root.right = t;

    assertTrue(new PathSum().hasPathSum(root, 7));
  }
}
