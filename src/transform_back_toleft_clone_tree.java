public static Node transBackFromLeftClonedTree(Node node) {
    if( node == null)
    return null;
    Node lcr = transBackFromLeftClonedTree(node.left.left);
    Node rcr = transBackFromLeftClonedTree(node.right);
    
    node.left = lcr;
    node.right = rcr;
    
    return node;
  }
