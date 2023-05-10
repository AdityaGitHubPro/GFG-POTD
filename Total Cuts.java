class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int count=0,leftmax=-1,rightmin=Integer.MAX_VALUE;
        int leftarr[]=new int[N];
        int rightarr[]=new int[N];
        for(int i=0;i<N;i++){
            leftmax=Math.max(A[i],leftmax);
            leftarr[i]=leftmax;
        }
        for(int i=N-1;i>=0;i--){
            rightmin=Math.min(A[i],rightmin);
            rightarr[i]=rightmin;
        }
        for(int i=1;i<N;i++){
            if(leftarr[i-1]+rightarr[i]>=K){
                count++;
            }
        }
        return count;
    }
}
        
