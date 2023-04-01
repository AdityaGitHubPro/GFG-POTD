Question Link: https://practice.geeksforgeeks.org/problems/1f05c7c12b1084f270c57566b2110967c046730d/1



class Solution {
    public long minOperations(int N) {
        long ans = N / 2;
        ans *= (N + 1) / 2;
        return ans;
    }
}
