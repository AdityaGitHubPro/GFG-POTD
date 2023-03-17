Question Link: https://practice.geeksforgeeks.org/problems/0960a833f70b09c59444ea487f99729929fc8910/1



class Solution{
	long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		long ans = 0, cnt = 0;
        for(int i : arr) {
            if(i == 0) {
                cnt++;
                ans += cnt;
            } else {
                cnt = 0;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
	}
}
