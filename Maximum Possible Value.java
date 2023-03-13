Question Link: https://practice.geeksforgeeks.org/problems/2d3fc3651507fc0c6bd1fa43861e0d1c43d4b8a1/1



class Solution { 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        long x , y, mn = (long)1e10, ans = 0, tot = 0;
        for(int i = 0; i < N; i++){
            x = A[i];
            y = B[i];
            if(y % 2 == 1)
                y--;
            if(y >= 2){
                mn = Math.min(mn,x);
            }
            ans += y*x;
            tot += y;
        }
        if(tot % 4 != 0){
           ans -= 2l * mn;
        }
        return ans;
    }
}  
