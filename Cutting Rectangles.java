Question Link: https://practice.geeksforgeeks.org/problems/a7a4da81b20f4a05bbd93f5786fcf7478298f4f5/1



class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        long a = gcd(L, B);
        return Arrays.asList((L*B)/(a*a), a);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
