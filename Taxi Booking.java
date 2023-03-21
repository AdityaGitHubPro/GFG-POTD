Question Link: https://practice.geeksforgeeks.org/problems/7995e41d167d81f14f1d4194b29ef839f52d18ba/1



class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min_time=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
           int temp=(Math.abs(cur-pos[i]))*time[i];
            if(temp<min_time) min_time=temp;
         
        }
        return min_time;
    }
}
