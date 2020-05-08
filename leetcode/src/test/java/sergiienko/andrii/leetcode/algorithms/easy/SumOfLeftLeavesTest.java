package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import static org.junit.Assert.assertEquals;

public class SumOfLeftLeavesTest {
  @Test
  public void case1() {
    TreeNode t = new TreeNode(20);
    t.left = new TreeNode(15);
    t.right = new TreeNode(7);
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = t;

    assertEquals(24, new SumOfLeftLeaves().sumOfLeftLeaves(root));
  }

  @Test
  public void case2() {
    TreeNode t = new TreeNode(2);
    t.left = new TreeNode(4);
    t.right = new TreeNode(5);
    TreeNode root = new TreeNode(1);
    root.left = t;
    root.right = new TreeNode(3);

    assertEquals(4, new SumOfLeftLeaves().sumOfLeftLeaves(root));
  }
}
