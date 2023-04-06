Question Link: https://practice.geeksforgeeks.org/problems/78a6854c8a2915e05f236aa407dfaa1bbc8ae7d3/1



class Solution{
	int equalSum(int [] A, int N) {
		int sum=0;
		int total=0;
		for(int i=0;i<A.length;i++){
		    total+=A[i];
		}
		for(int i=0;i<A.length;i++){
		    total-=A[i];
		    if(sum==total){
		        return i+1;
		    }
		    sum+=A[i];
		}
		return -1;
	}
}
