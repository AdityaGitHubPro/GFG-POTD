Question Link: https://practice.geeksforgeeks.org/problems/c670bf260ea9dce6c5910dedc165aa403f6e951d/1



class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        HashSet<Integer> hs=new HashSet<>();
        int a[]=new int[N];
        for(int i=N-1;i>=0;i--)
        {
            
            a[i]=hs.size();
            hs.add(A[i]);
        }
        hs=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            ans.add(hs.size()-a[i]);
            hs.add(A[i]);
        }
        return ans;
    }
}
  
