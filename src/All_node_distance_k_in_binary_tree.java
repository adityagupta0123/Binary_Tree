class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> nodes = new ArrayList<>();
        
        findNodes(root, target, k, nodes);
        return nodes;
    }
    
    private int findNodes(TreeNode node, TreeNode target, int k, List<Integer> nodes) {
        if (node == null) {
            return k + 1;
        }
        
        if (node == target) {
            printKLevelDown(node, k, nodes);
            return 1;
        }
        
        int left = findNodes(node.left, target, k, nodes);
        if (left == k) {
            nodes.add(node.val);
        } else if (left < k) {
            printKLevelDown(node.right, k - left - 1, nodes);
            return left + 1;
        }
        
        int right = findNodes(node.right, target, k, nodes);
        if (right == k) {
            nodes.add(node.val);
        } else if (right < k) {
            printKLevelDown(node.left, k - right - 1, nodes);
            return right + 1;
        }
        
        return k + 1;
    }
    
    private void printKLevelDown(TreeNode node, int k, List<Integer> nodes) {
        if (node == null) {
            return;
        }
        
        if (k == 0) {
            nodes.add(node.val);
            return;
        }
        
        printKLevelDown(node.left, k - 1, nodes);
        printKLevelDown(node.right, k - 1, nodes);
    }
}
