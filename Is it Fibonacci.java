Question Link: https://practice.geeksforgeeks.org/problems/202d95ecdeec659401edc63dd952b1d37b989ab8/1


class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        ArrayList<Long> geekySeries = new ArrayList<>(N);
        for (int i = 0; i < K; i++) {
            geekySeries.add(GeekNum.get(i));
        }
        for (int i = K; i < N; i++) {
            long sum = 0;
            for (int j = i - 1; j >= i - K; j--) {
                sum += geekySeries.get(j);
            }
            geekySeries.add(sum);
        }
        return geekySeries.get(N-1);
    }
}
