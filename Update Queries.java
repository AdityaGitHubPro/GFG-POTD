Question Link: https://practice.geeksforgeeks.org/problems/a6528c893d4ab645ec6e0690c7982748385099c8/1



class Solution{
	int [] updateQuery(int N, int Q, int [][]U){
        int[] ans= new int[N];
        for(int i=0;i<Q;i++){
            int l=U[i][0]-1;
            int r=U[i][1]-1;
            int x=U[i][2];
            help(ans,l,r,x);
        }
        return ans;
    }
    void help(int[] ans, int l, int r, int x){
        for(int i=l;i<=r;i++){
            ans[i]=ans[i]|x;
        }
    }
}
