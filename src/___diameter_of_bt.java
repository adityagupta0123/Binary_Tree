
// class Solution {  O (n ^2)
//     public int diameterOfBinaryTree(TreeNode root) {
//         if ( root == null)
//             return 0;
//         int lh = diameterOfBinaryTree(root.left);
//         int rh = diameterOfBinaryTree(root.right);
        
//         int f = height(root.left) + height(root.right) ;
        
//         int dia = Math.max(f, Math.max(lh, rh));
        
//         return dia;
                
//     }
//     private int height(TreeNode root){
//         if( root == null)
//             return 0;
//         int llh = height(root.left);
//         int rrh = height(root.right);
        
//         int h = Math.max(llh, rrh) + 1;
//         return h;
//     }
// }


// class Solution {  O(n)
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null)return 0;
   
//         DiaPair ans=findDiameter(root);
        
//         return ans.diameter;
//     }
    
//     public DiaPair findDiameter(TreeNode root ){  //O(n)
//         if(root==null){
//             return new DiaPair(-1, 0);
//         }
        
//         DiaPair lhs=findDiameter(root.left);
//         DiaPair rhs=findDiameter(root.right);
        
//         DiaPair myPair=new DiaPair();
//         myPair.diameter=Math.max(lhs.height+rhs.height+2, Math.max(lhs.diameter, rhs.diameter));
//         myPair.height=Math.max(lhs.height, rhs.height)+1;
        
//         return myPair;
//     }
// }
// class DiaPair{
//     int height;
//     int diameter;
    
//     public DiaPair(){}
    
//     public DiaPair(int height, int diameter){
//         this.height=height;
//         this.diameter=diameter;
//     }
// }


class Solution { //O(n)
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null )return 0;
        height(root);
        return ans;
    }
    
    public int height(TreeNode root){
        //if root==null height==0
        if(root==null)return -1;
        
        int L=height(root.left);
        int R=height(root.right);
        //ans signfies(no. of nodes farthest apart) or the DIAMETER
        ans=Math.max(ans,L+R+2);
        //height of the tree is max of LST & RST +1
        return 1+Math.max(L,R);
    }
}
