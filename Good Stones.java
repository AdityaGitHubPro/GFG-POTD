Question Link: https://practice.geeksforgeeks.org/problems/e2d156755ca4e0a9b9abf5680191d4b06e52b1a8/1


class Solution {
    static int dp[];
    public static int goodStones(int n, int[] arr) {
        // code here
        dp=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            if(dp[i]==-1)
            dp[i]=fun(i,arr);
        }
        int ans=0;
        for(int i:dp){
            if(i==1){
                ans++;
            }
        }
        return ans;
    }
    public static int fun(int i,int arr[])
    {
        if(i<0 || i>=arr.length)return 1;
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=0;
        return dp[i]=fun(i+arr[i],arr);
    }
}         
