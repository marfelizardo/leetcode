package leetcode;

import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    @Test
    void testInvertBinaryTree() {

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));

        TreeNode invertedRoot = invertBinaryTree.invertTree(root);

        assert invertedRoot.val == 4;
        assert invertedRoot.left.val == 7;
        assert invertedRoot.right.val == 2;
        assert invertedRoot.left.left.val == 9;
        assert invertedRoot.left.right.val == 6;
        assert invertedRoot.right.left.val == 3;
        assert invertedRoot.right.right.val == 1;
    }
}
