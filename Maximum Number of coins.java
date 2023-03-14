Question Link: https://practice.geeksforgeeks.org/problems/7ae455e552dc4e07f76bbe2adc4d4207ce1ff16e/1



class Solution{
    int maxCoins(int N, ArrayList<Integer> arr) {
		arr.add(1);
		arr.add(0,1);
		N = arr.size();
		int [][] d = new int[N][N];
		for(int i = 0; i < N; i++)
		{
		    Arrays.fill(d[i],0);
		}
		for(int a = N-3; a > -1; a--)
        {
            for(int b = a + 2; b < N; b++)
            {
                for(int c = a + 1; c < b; c++)
                {
                    d[a][b] = Math.max(d[a][b], d[a][c] + d[c][b] + arr.get(a) * arr.get(b) * arr.get(c));
                }
            }
        }
        return d[0][N-1];
	}
}
