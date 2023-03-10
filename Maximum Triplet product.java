Question Link: https://practice.geeksforgeeks.org/problems/d54c71dc974b7db3a200eb63f34e3d1cba955d86/1



class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-3]*arr[n-2]*arr[n-1]);
    }
}
