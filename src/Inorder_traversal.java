
class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
    //    List<Integer> res = new ArrayList<>();
    //     if( root == null)
    //         return res;
    //     Stack<TreeNode> stack = new Stack<>();
    //     TreeNode curr = root;
    //     while( curr != null || !stack.isEmpty()){
    //         while(curr != null){
    //             stack.push(curr);
    //             curr= curr.left;
    //         }
    //         curr = stack.pop();
    //         res.add(curr.val);
    //         curr = curr.right ;
    //     }
    //     return res;
    // }
     List<Integer> res = new LinkedList<>(); 
     public List<Integer> inorderTraversal(TreeNode root) {
         if (root != null)
             Inorder(root);
         return res; 
     }
     public void Inorder(TreeNode root){
         if( root.left != null)
             Inorder(root.left);
         res.add(root.val);
         if( root.right != null)
             Inorder(root.right);
     }
    
}
