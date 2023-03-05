Question Link: https://practice.geeksforgeeks.org/problems/07e45fe40846bc670ad2507d2c649304699768b9/1



class Solution {
    public static int noConseBits(int n) {
        int c=0;
        String a=Integer.toBinaryString(n);
        char arr[]=a.toCharArray();
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]=='1' && arr[i+1]=='1' && arr[i+2]=='1'){
                arr[i+2]='0';
            }
        }
        String b=String.valueOf(arr);
        return Integer.parseInt(b,2);
    }
}
