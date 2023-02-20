Question Link: https://practice.geeksforgeeks.org/problems/2145720aebf8ea0b07f76b17217b3353a0fbea7f/1



class Solution
{
    public static int minIteration(int n, int m, int x, int y){
        int ans=Math.max(Math.max(x-1+y-1,x-1+m-y),Math.max(n-x+y-1,n-x+m-y ));
        return ans;
    }
}
