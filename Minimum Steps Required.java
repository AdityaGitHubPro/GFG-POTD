Question Link: https://practice.geeksforgeeks.org/problems/6a1b365b520f10c8a29b533eb72951b4b4237b57/1



class Solution{
	int minSteps(String str) {
		int count=1;
        int n=str.length();
        char last=str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)!=last){
                last=str.charAt(i);
                count++;
            }
        }
        return count/2 +1;
	}
}
