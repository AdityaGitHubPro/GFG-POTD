Question Link: https://practice.geeksforgeeks.org/problems/2a1c11024ceae36363fc405e07f2fa3e2f896ef0/1



class Solution {
    public static int dominantPairs(int n, int[] arr) {
        Arrays.sort(arr, 0, n/2);
        int ans = 0;
        for (int i = n/2; i < n; i++) {
            ans += n/2 - Arrays.binarySearch(arr, 0, n/2, 5 * arr[i]);
        }
        return ans;
    }
}
