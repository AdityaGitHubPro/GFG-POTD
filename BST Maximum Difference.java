Question Link: https://practice.geeksforgeeks.org/problems/e841e10213ddf839d51c2909f1808632a19ae0bf/1



class Solution
{
    public static void help(Node root,int target,int a,int b,int ans[],boolean mila){
        if(root==null){
            return;
        }
        if(root.data==target)mila=true;
        if(mila==true){
            b+=root.data;
            help(root.left,target,a,b,ans,mila);
            help(root.right,target,a,b,ans,mila);
            if(root.left==null && root.right==null){
                b-=target;
                ans[0]=Math.max(ans[0],a-b);
            }
        }
        else{
            a+=root.data;
            if(target<root.data)help(root.left,target,a,b,ans,mila);
            else help(root.right,target,a,b,ans,mila);
        }
    }

    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        int a=0,b=0;
        int ans[] = new int[1];
        ans[0]=Integer.MIN_VALUE;
        boolean mila=false;
        help(root,target,a,b,ans,mila);
        if(ans[0]==Integer.MIN_VALUE)return -1;
        return ans[0];

        
    }
}
