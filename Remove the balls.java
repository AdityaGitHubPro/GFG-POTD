Question Link: https://practice.geeksforgeeks.org/problems/546ea68f97be7283a04ddcc8057e09b46a686471/1



class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<N;i++){
            int a=color[i],b=radius[i];
            if(st.empty()) st.push(new int[]{a,b});
            else{
                int[] prev=st.peek();
                if(prev[0]==a&&prev[1]==b) st.pop();
                else st.push(new int[]{a,b});
            }
        }
        return st.size();
    }
}
