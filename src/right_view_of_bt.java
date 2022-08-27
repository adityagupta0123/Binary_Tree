class Solution {
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> list = new LinkedList<>();
     printrightview(root, list, 0);
     return list;
    }
    
    public void printrightview(TreeNode root, List<Integer> list, int level) {
        if(root == null)
           return;
        if( list.size() == level)
           list.add(root.val);
        
        printrightview(root.right, list, level + 1);   
        printrightview(root.left, list , level + 1);
    }
}
