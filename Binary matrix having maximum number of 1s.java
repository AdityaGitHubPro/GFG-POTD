Question Link: https://practice.geeksforgeeks.org/problems/77e1c3e12cd148f835d53eb168d4472b2ff539fa/1



class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int ans[] = new int[2];
        int maxCount = 0, maxRow = 0;
        for(int i = 0; i < N; i++){
            int c = 0;
            for(int j = 0; j < N; j++){
                if(mat[i][j] == 1){
                    c++;
                }
            }
            if(c > maxCount){
                maxCount = c;
                maxRow = i;
            }
        }
        ans[0] = maxRow;
        ans[1] = maxCount;
        return ans;
    }
};
