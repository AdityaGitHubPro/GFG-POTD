Question Link: https://practice.geeksforgeeks.org/problems/13eb74f1c80bc67d526a69b8276f6cad1b8c3401/1



class Solution {
    static int checkCompressed(String s, String t) {
        int n = 0;
        int flag = 1;
        int j = 0;
        for(int i=0; i<t.length(); i++)
        {
            if (t.charAt(i)>='0' && t.charAt(i)<='9')
            {
                n *= 10;
                if(n>100000)
                    return 0;
                n += t.charAt(i) - '0';
                j--;
            }
            else
            {
                j += n;
                if(t.charAt(i)!=s.charAt(j))
                {
                    flag = 0;
                    break;
                }
                n = 0;
            }
            j++;
        }
        j += n;
        if(j != s.length())
            flag = 0;

        if(flag==1)
            return 1;
        else
            return 0;
    }
}
