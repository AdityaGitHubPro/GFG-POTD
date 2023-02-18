Question Link: https://practice.geeksforgeeks.org/problems/6c4053871794c5e7a0817d7eaf88d71c4bb4c2bc/1


class Solution {
    Node w1 = null, w2 = null;
    public Node correctBST(Node root) {
        inorder(root);
        // System.out.println(w1.data+" "+w2.data);
        int temp = w1.data;
        w1.data = w2.data;
        w2.data = temp;
        return root;
    }
    Node prev = null;
    public void inorder(Node root) {
        if(root == null) return;
        // last = root;
        inorder(root.left);
        if(prev!=null){
            if(prev.data > root.data){
                if(w1 == null) w1 = prev;
                 w2 = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}
