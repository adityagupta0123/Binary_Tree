class Solution {
//     public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//         List<Integer> nodes = new ArrayList<>();
        
//         findNodes(root, target, k, nodes);
//         return nodes;
//     }
    
//     private int findNodes(TreeNode node, TreeNode target, int k, List<Integer> nodes) {
//         if (node == null) {
//             return k + 1;
//         }
        
//         if (node == target) {
//             printKLevelDown(node, k, nodes);
//             return 1;
//         }
        
//         int left = findNodes(node.left, target, k, nodes);
//         if (left == k) {
//             nodes.add(node.val);
//         } else if (left < k) {
//             printKLevelDown(node.right, k - left - 1, nodes);
//             return left + 1;
//         }
        
//         int right = findNodes(node.right, target, k, nodes);
//         if (right == k) {
//             nodes.add(node.val);
//         } else if (right < k) {
//             printKLevelDown(node.left, k - right - 1, nodes);
//             return right + 1;
//         }
        
//         return k + 1;
//     }
    
//     private void printKLevelDown(TreeNode node, int k, List<Integer> nodes) {
//         if (node == null) {
//             return;
//         }
        
//         if (k == 0) {
//             nodes.add(node.val);
//             return;
//         }
        
//         printKLevelDown(node.left, k - 1, nodes);
//         printKLevelDown(node.right, k - 1, nodes);
//     }
    
        Map<TreeNode, Integer> map = new HashMap<>();
        
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new LinkedList<>();
        find(root, target);
        dfs(root, target, K, map.get(root), res);
        return res;
    }
    
    // find target node first and store the distance in that path that we could use it later directly
    private int find(TreeNode root, TreeNode target) {
        if (root == null) return -1;
        if (root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = find(root.left, target);
        if (left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
		int right = find(root.right, target);
		if (right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }
    
    private void dfs(TreeNode root, TreeNode target, int K, int length, List<Integer> res) {
        if (root == null) return;
        if (map.containsKey(root)) length = map.get(root);
        if (length == K) res.add(root.val);
        dfs(root.left, target, K, length + 1, res);
        dfs(root.right, target, K, length + 1, res);
    }

}
