Question Link: https://practice.geeksforgeeks.org/problems/5c2734730cb1e98e3877a0b91f7d680d0efc8acf/1



class Solution{
    static String secondSmallest(int S, int D){
        if(S>=D*9 || S==1 || D==1)
            return "-1";
        
        int dup = D;
        
    	S -= 1;
    	String res = "";
    	for(int i=D-1; i>0; i--)
    	{
    		if(S>9)
    		{
    			res += (char)(57);
    			S -= 9;
    		}
    		else 
    		{
    			res += (char)(48+S);
    			S = 0;
    		}
    	}
    	res += (char)(48+S+1);
    	String ans = "";
    	for(int i=res.length()-1; i>=0; i--)
    	    ans += res.charAt(i);
    	
    	int ind = dup-1;
    	for(int i=dup-1; i>=0; i--)
    	{
    	    if(ans.charAt(i)=='9')
    	        ind = i;
    	    else
    	        break;
    	}
    	
    	char[] ansChars = ans.toCharArray();
        ansChars[ind] -= 1;
        ansChars[ind-1] += 1;
        ans = String.valueOf(ansChars);
    	
    	return ans;
    }
}
