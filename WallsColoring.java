Question Link: https://practice.geeksforgeeks.org/problems/51b266505221b97522b1d2c86ddad1868a54831b/1



class Solution{

 int minCost(int [][] colors, int N){

        //Write your code here

        int dp[][] = new int[N][4];

        for(int a[]: dp) Arrays.fill(a, -1);

        return utilMemo(N-1, 3, colors, dp);

        

    }

    int utilMemo(int ind, int prev, int colors[][], int dp[][]){

        

        if(ind == 0){

            int mini = Integer.MAX_VALUE;

            for(int i=0; i<3; i++){

                if(i!=prev)

                    mini = Math.min(mini, colors[ind][i]);

            }

            return mini;

        }

        if(dp[ind][prev] != -1) return dp[ind][prev];

        

        int minCost = Integer.MAX_VALUE;

        for(int i=0; i<3; i++){

            if(i != prev){

               int cost = colors[ind][i] + utilMemo(ind-1, i, colors, dp);

               minCost = Math.min(cost, minCost);

            }

        }

        return dp[ind][prev] =  minCost;

    }
}
