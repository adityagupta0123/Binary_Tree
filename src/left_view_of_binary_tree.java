class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
     ArrayList<Integer> list = new ArrayList<>();
     printleftview(root, list, 0);
     return list;
    }
    
    public void printleftview(Node root, ArrayList<Integer> list, int level) {
        if(root == null)
           return;
        if( list.size() == level)
           list.add(root.data);
        printleftview(root.left, list , level + 1);
        printleftview(root.right, list, level + 1);
    }
}
