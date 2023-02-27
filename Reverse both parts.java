Question Link: https://practice.geeksforgeeks.org/problems/bae68b4d6a2a77fb6bd459cf7447240919ebfbf5/1



class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node temp = head;
        Node prev = null;
        int count = 1;
        while(k==-1 && temp!=null || count<=k){
            Node aage = temp.next;
            temp.next = prev;
            prev = temp;
            temp = aage;
            count++;
        }
        if(k!=-1){
            head.next = reverse(temp, -1);
        }
        return prev;
    }
}
