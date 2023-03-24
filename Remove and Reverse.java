Question Link: https://practice.geeksforgeeks.org/problems/1e2f365be6114b671b915e145ec7dbcfdc432910/1



class Solution 
{ 
    String removeReverse(String S) 
    { 
        int len=S.length();
        int i=0;
        int j=len-1;
        Boolean rev=false;
        int []temp=new int[26];
  
        int []arr=new int[len];
        for( i=0;i<len;i++)
        temp[S.charAt(i)-97]++;
        
        i=0;
        while(i<=j)
        {
            if(rev==false)
            {
                if(temp[S.charAt(i)-97]==1)
                {
                    arr[i]=1;
                    i++;
                    continue;
                }
                else
                {
                    temp[S.charAt(i)-97]--;
                    rev=true;
                }
                i++;
            }
            else
            {
                if(temp[S.charAt(j)-97]==1)
                {
                    arr[j]=1;
                    j--;
                    continue;
                }
                else
                {
                    temp[S.charAt(j)-97]--;
                    rev=false;
                }
                j--;
            }
           
        }
        
        StringBuilder sb=new StringBuilder();
        for( i=0;i<len;i++)
        {
            if(arr[i]==0)
            continue;
            sb.append(S.charAt(i));
        }
        
        StringBuilder str=new StringBuilder();
        str.append(sb);
        str.reverse();
        
        if(rev==true)
        return str.toString();
      
        return sb.toString();
    }
} 
