class Tree
{
      static void sibling(Node root, ArrayList <Integer> arr ){
       
       if(root==null){
           return;
       }
       
       if(root.left != null && root.right == null){
           arr.add(root.left.data);
           
       }
       if(root.right != null && root.left == null){
           arr.add(root.right.data);
       }
       
       sibling(root.left,arr);
       sibling(root.right, arr);
   }
   ArrayList<Integer> noSibling(Node node)
   {
       // code here
       ArrayList<Integer> ans = new ArrayList<>();
       
       if(node == null ||( node.left == null && node.right == null)){
           return ans;
       }
       
       sibling(node, ans);
       Collections.sort(ans);
       
       if(ans.size()<1){
           ans.add(-1);
       }
       
       return ans;
       
       
   }
}
