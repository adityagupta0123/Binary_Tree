class Solution {
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if (root != null) revPreOrder(root);
    }
    private void revPreOrder(TreeNode node) {
        if (node.right != null) revPreOrder(node.right);
        if (node.left != null) revPreOrder(node.left);
        node.left = null;
        node.right = head;
        head = node;
    }
}

    // public void flatten(TreeNode root) {
    //     TreeNode head = null, curr = root;
    //     while (head != root) {
    //         if (curr.right == head) curr.right = null;
    //         if (curr.left == head) curr.left = null;
    //         if (curr.right != null) curr = curr.right;
    //         else if (curr.left != null) curr = curr.left;
    //         else {
    //             curr.right = head;
    //             head = curr;
    //             curr = root;
    //         }
    //     }
    // }
// }
