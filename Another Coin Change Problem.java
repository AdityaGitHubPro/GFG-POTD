class Solution {
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        // code here
        boolean dp[][] = new boolean[target+1][K+1];
        dp[0][0] = true;
        for(int i=0; i<=target; i++){
            for(int j=0; j<=K; j++){
                for(int coin: coins){
                    if(coin<=i && j>0 && dp[i-coin][j-1]){
                        dp[i][j] = true;
                        break;
                    }
                }
            }
        }
        return dp[target][K];
    }
}
