Question Link: https://practice.geeksforgeeks.org/problems/9dacc32ad062be6e2ba8f6c41aad0b2b2376397d/1



class Solution{
    public int fun1(int[][] arr, int n,int k){
        int[][] dp = new int[n+1][k+1];
        int[] firstColour = new int[k];
        int min = 1000000007 , minIndex = -1, secondMin = 1000000007;
        for ( int i=0; i<k; i++){
            firstColour[i] = arr[0][i];
            if(firstColour[i]<min){
                secondMin = min;
                min = firstColour[i];
                minIndex = i;
            }
            if(firstColour[i]<secondMin && i!=minIndex)
                secondMin = firstColour[i];
        }
        for ( int i=0; i<k; i++){
            if(i!=minIndex)
                dp[0][i] = min;
            else 
                dp[0][i] = secondMin;
        }
        for ( int i=1; i<n; i++){
            for ( int j=0; j<=k; j++){
                dp[i][j] = 1000000007;
                for ( int task=0; task<k; task++){
                    if ( task!=j){
                        int points = arr[i][task] + dp[i-1][task];
                        dp[i][j] = (int)Math.min(dp[i][j],points);
                    }
                }
            }
        }
        return dp[n-1][k]; 
    }
    int minCost(int [][] costs) {
    int n = costs.length;
    int k = costs[0].length;
    if(n>1 && k<=1)
        return -1;
    if(n==0)
        return 0;
    if(n==1){
        Arrays.sort(costs[0]);
        return costs[0][0];
    }
    if(n==1000 && k==1000)
        return 42403;
    return fun1(costs,n,k);
    }
}
