class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                return 1;
            }
        }
        return 2;
    }
}
 
