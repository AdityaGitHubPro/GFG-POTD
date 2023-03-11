Question Link: https://practice.geeksforgeeks.org/problems/ad6699d4aaf84c74b119fac3b65e9ceb3fc8ef14/1



class Solution {
     public static int freq(int[] a,int b,int j)
    {
        int c=0;
        for(int i=j;i<a.length;i++)
        {
            if(a[i]==b)
            {
                c++;
            }
        }
        return c;
    }
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
          ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<num;i++)
        {
            int l=Q[i][0];
            int r=Q[i][1];
            int k=Q[i][2];
            int c=0;
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=l;j<=r;j++)
            {
                int f=freq(A,A[j],j);
                temp.add(f);
            }
            for(int m=0;m<temp.size();m++)
            {
                if(temp.get(m)==k)
                {
                    c++;
                }
            }
            ans.add(c);
        }
        return ans;
        
    }
}
