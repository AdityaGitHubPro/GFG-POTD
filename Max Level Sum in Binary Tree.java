https://practice.geeksforgeeks.org/problems/4b7ff87c26ed23b3f63c25c611690213d44fb6aa/1Question Link: 



class Solution {
    public int maxLevelSum(Node root) {
        if (root == null) {
            return 0;
        }
    
        int maxSum = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
    
        while (!queue.isEmpty()) {
            int levelSum = 0;
            int levelSize = queue.size();
        
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelSum += node.data;
            
                if (node.left != null) {
                    queue.offer(node.left);
                }
            
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        
            maxSum = Math.max(maxSum, levelSum);
        }
    
        return maxSum;
    }
}
