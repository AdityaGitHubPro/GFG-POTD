Question Link: https://practice.geeksforgeeks.org/problems/38f100615d0b2efa755e7b07f905e0f8cd2fe5df/1



class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int count = 0;
        int i = 0, j = 0;
        int maxlen = Integer.MIN_VALUE;
        
        while (j < n) {
            char ch = arr.charAt(j);
            if (ch == 'O') {
                count++;
            }
            j++;
            
            while (count > m) {
                ch = arr.charAt(i);
                if (ch == 'O') {
                    count--;
                }
                i++;
            }
            maxlen = Math.max(maxlen, j-i);
        }
        
        return maxlen;
    }
}
