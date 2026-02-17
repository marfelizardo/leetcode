package leetcode;

import org.junit.jupiter.api.Test;

public class RootEqualsSumOfChildrenTest {

    @Test
    void testCheckTree() {

        RootEqualsSumOfChildren rootEqualsSumOfChildren = new RootEqualsSumOfChildren();

        TreeNode treenode;

        treenode = new TreeNode(10, new TreeNode(4), new TreeNode(6));

        assert(rootEqualsSumOfChildren.checkTree(treenode) == true);

        treenode = new TreeNode(5, new TreeNode(3), new TreeNode(1));

        assert(rootEqualsSumOfChildren.checkTree(treenode) == false);

    }
}
