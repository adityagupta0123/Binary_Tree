class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         ArrayList <Integer> list  = new ArrayList<>();
         getHelp(root, k, list);
          return list;
     }
     void getHelp(Node root , int k, ArrayList<Integer> list){
          if( root == null || k <0){
             return ;
         }
         if (k ==0 ){
             list.add(root.data);
         }
          getHelp(root.left, k-1, list);
          getHelp(root.right, k-1, list);
     }
}
