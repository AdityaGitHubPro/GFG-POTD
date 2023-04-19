class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        char[] c = S.toCharArray();
        int last = -1;
        for(int i = 0; i < N; i++){
            if(c[i] =='1'){
                if(i - X > last + 1)
                    return false;
                else
                    last = i + X;
            }
        }
        return last >= N - 1;
    }
} 
