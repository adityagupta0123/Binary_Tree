class Solution {
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> pre = new LinkedList<>();
    //     preHelper(root, pre);
    //     return pre;
    // }
    // public void preHelper(TreeNode root, List<Integer> pre) {
    //     if( root == null) return ;
    //     pre.add(root.val);
    //     preHelper(root.left, pre);
    //     preHelper(root.right,pre);
    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if( root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while( !stack.isEmpty() ){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if( curr.right != null ) {
                stack.push(curr.right);
            }
            if(curr.left != null)
                stack.push(curr.left);
            
        }
        return list;
    }
}
