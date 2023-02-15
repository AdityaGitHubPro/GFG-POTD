Question Link: https://practice.geeksforgeeks.org/problems/234ca3b438298fb04befd5abe7fbd98c006d4884/1


class Solution{
	int water_flow(int [][] mat, int N, int M) {
		
		boolean[][] result1 = new boolean[N][M];
		boolean[][] result2 = new boolean[N][M];
		
		for(int row=0;row<N;row++){
		    flowWater(row, 0, result1, mat, N, M, Integer.MIN_VALUE);
		    flowWater(row, M-1, result2, mat, N, M, Integer.MIN_VALUE);
		}
		
		for(int col=0;col<M;col++){
		    flowWater(0, col, result1, mat, N, M, Integer.MIN_VALUE);
		    flowWater(N-1, col, result2, mat, N, M, Integer.MIN_VALUE);
		}
		
		
		return countTrue(result1, result2);
		
		
	}
	
	private int countTrue(boolean[][] result1, boolean[][] result2){
	    
	    int count = 0;
	    
	    for(int row=0;row<result1.length;row++){
	        for(int col=0;col<result1[row].length;col++){
	            
	            if(result1[row][col] == true && result2[row][col] == true){
	                count++;
	            }
	        }
	    }

	    return count;
	}
	
	private void flowWater(int row, int col, boolean[][] result, int[][] mat, int n, int m, int prev){
	    
	    if(row<0 || row>=n || col<0 || col>=m || result[row][col] == true || mat[row][col] < prev){
	        return;
	    }
	    
	    
	    result[row][col] = true;
	    
	    
	    flowWater(row+1, col, result, mat, n, m, mat[row][col]);
	    flowWater(row-1, col, result, mat, n, m, mat[row][col]);
	    flowWater(row, col-1, result, mat, n, m, mat[row][col]);
	    flowWater(row, col+1, result, mat, n, m, mat[row][col]);
	    
	    
	}
}
