class Solution{
	int maxSweetness(int [] sweetness, int N, int K) {
	    // Write your code here.
	     int left = 1;
        int right = 0;
        for (int i = 0; i < N; i++) {
            right += sweetness[i];
        }
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canDivide(sweetness, N, K, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    private boolean canDivide(int[] sweetness, int N, int K, int target) {
        int pieces = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sweetness[i];
            if (sum >= target) {
                pieces++;
                sum = 0;
            }
        }
        return pieces >= K + 1;
	}
}
