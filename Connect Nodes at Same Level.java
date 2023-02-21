Question Link: https://practice.geeksforgeeks.org/problems/95423710beef46bd66f8dbb48c510b2c320dab05/1



class Solution {
    public void connect(Node root) {
        // code here
        if(root==null)  return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node curr = null;
            while(size-->0){
                curr = q.poll();
                curr.nextRight = q.peek();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null)    q.offer(curr.right);
            }
            curr.nextRight = null;
        }
    }
}
