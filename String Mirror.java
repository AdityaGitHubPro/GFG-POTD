class Solution {
    public static String stringMirror(String str) {
        // code here
        char c[]=str.toCharArray();
        int n=c.length;
        if(n==1)return c[0]+""+c[0];
        if(c[0]==c[1])return c[0]+""+c[0];
        int i;
        for(i=0;i<n-1;i++){
            if(c[i+1]<=c[i])continue;
            break;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.substring(0,i+1));
        StringBuilder sb1=new StringBuilder();
        sb1.append(sb);
        sb1.reverse();
        sb.append(sb1);
        return sb.toString();
    }
}
       
