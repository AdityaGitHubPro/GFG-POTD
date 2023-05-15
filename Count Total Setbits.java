class Solution {
    public static long countBits(long N) {
        // code here
        long count=0;
        for(int i=0;i<=N;i++){
            count+=Integer.bitCount(i);
        }
        return count;
    }
}
        
