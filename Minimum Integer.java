Question Link: https://practice.geeksforgeeks.org/problems/1ccf56f107bcb24242469ea45c02f852165a2184/1



class Solution {
    public static int minimumInteger(int N, int[] A) {
        long s=0;
        for(int e:A)s+=e;
        int ans=Integer.MAX_VALUE;
        for(int x:A)if((long)x*N>=s)ans=Math.min(x,ans);
        return ans;
    }
}
