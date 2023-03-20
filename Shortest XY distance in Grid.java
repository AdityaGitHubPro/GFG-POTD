Question Link: https://practice.geeksforgeeks.org/problems/7366ce450d84b55391fc787a681c4d60de359e72/1



class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
        int minDist = Integer.MAX_VALUE;

        // Find the positions of X and Y in the grid
        ArrayList<int[]> xPositions = new ArrayList<>();
        ArrayList<int[]> yPositions = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char c = grid.get(i).get(j);
                if (c == 'X') {
                    xPositions.add(new int[]{i, j});
                } else if (c == 'Y') {
                    yPositions.add(new int[]{i, j});
                }
            }
        }

        // Calculate the Manhattan distance between each X and Y
        for (int[] x : xPositions) {
            for (int[] y : yPositions) {
                int dist = Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }

        return minDist;
    }
};
