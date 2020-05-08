package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;
import sergiienko.andrii.leetcode.helpers.TreeNode;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvertBinaryTreeTest {
  @Test
  public void case1() {
    TreeNode root = new TreeNode(4);
    TreeNode l = new TreeNode(2);
    l.left = new TreeNode(1);
    l.right = new TreeNode(3);
    TreeNode r = new TreeNode(7);
    r.left = new TreeNode(6);
    r.right = new TreeNode(9);
    root.left = l;
    root.right = r;

    TreeNode expectedRoot = new TreeNode(4);
    l = new TreeNode(7);
    l.left = new TreeNode(9);
    l.right = new TreeNode(6);
    r = new TreeNode(2);
    r.left = new TreeNode(3);
    r.right = new TreeNode(1);
    expectedRoot.left = l;
    expectedRoot.right = r;

    TreeNode actualRoot = new InvertBinaryTree().invertTree(root);

    List<Integer> expectedList = new InvertBinaryTree().toList(expectedRoot);
    List<Integer> actualList = new InvertBinaryTree().toList(actualRoot);

    for (int i = 0; i < expectedList.size(); i++) {
      assertEquals(expectedList.get(i), actualList.get(i));
    }
  }
}
