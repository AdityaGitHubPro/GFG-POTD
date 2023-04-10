Question Link: https://practice.geeksforgeeks.org/problems/63c232252d445a377e01cd91adfd7d1060580038/1



class Solution {
    public int maxIntersections(int[][] lines, int N) {
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            mp.put(lines[i][0], mp.getOrDefault(lines[i][0], 0) + 1);
            mp.put(lines[i][1] + 1, mp.getOrDefault(lines[i][1] + 1, 0) - 1);
        }
        int ans = 0, sum = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            sum += entry.getValue();
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
