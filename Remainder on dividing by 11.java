Question Link: https://practice.geeksforgeeks.org/problems/aa8c89caad6b5c3a76ba5e6d65454f77aac3f3543526/1


class Solution 
{ 
    static int xmod11(String x)
	{    
	    int res=0;
        for(int i=0;i<x.length();i++){
            res=(res*10 + (int) x.charAt(i)-'0') % 11;
        }
        
        return res;
	}
} 

