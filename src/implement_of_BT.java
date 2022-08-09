public class implement_of_BT {
    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = right = null ;
        }
    }
    public static void main(String[] args) {
        implement_of_BT tree = new implement_of_BT();
        Node root = new Node(5);
        System.out.println("BT");
        System.out.println("Build tree with root value " + root.value);

        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 9);

        System.out.println("traverse inorder");
        tree.traverseInorder(root);

    }

    public  void insert (Node node , int value){
        if ( value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted" + value + "to left of " + node.value);
                node.left = new Node(value);
            }
        } else if(value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted" + value + "to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInorder ( Node node) {
        if (node != null) {
            traverseInorder(node.left);
            System.out.print(" " + node.value);
            traverseInorder(node.right);
        }
    }

}
