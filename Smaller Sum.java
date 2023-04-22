class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        int max=0;
        for(int i=0;i<n;i++)
          max=Math.max(max,arr[i]);
          
        long sup[]=new long[max+1];
          
          
         
         for(int i=0;i<n;i++){
             ++sup[arr[i]];
         }
         
         
         for(int i=2;i<sup.length;i++){
             sup[i]=sup[i]*i+sup[i-1];
         }
         
        long ans[]=new long[n];
        
        for(int i=0;i<n;i++){
            if(arr[i]>1)
            ans[i]=sup[arr[i]-1];
        }
        
        return ans;
    }
}
