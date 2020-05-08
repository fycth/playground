package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SameTreeTest {
  @Test
  public void case1() {
    TreeNode l = new TreeNode(1);
    l.left = new TreeNode(2);
    l.right = new TreeNode(3);

    TreeNode r = new TreeNode(1);
    r.left = new TreeNode(2);
    r.right = new TreeNode(3);

    assertTrue(new SameTree().isSameTree(l, r));
  }

  @Test
  public void case2() {
    TreeNode l = new TreeNode(1);
    l.left = new TreeNode(2);

    TreeNode r = new TreeNode(1);
    r.right = new TreeNode(2);

    assertFalse(new SameTree().isSameTree(l, r));
  }

  @Test
  public void case3() {
    TreeNode l = new TreeNode(1);
    l.left = new TreeNode(2);
    l.right = new TreeNode(1);

    TreeNode r = new TreeNode(1);
    r.left = new TreeNode(1);
    r.right = new TreeNode(2);

    assertFalse(new SameTree().isSameTree(l, r));
  }
}
