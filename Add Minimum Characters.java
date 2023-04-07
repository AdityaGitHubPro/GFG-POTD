Question Link: https://practice.geeksforgeeks.org/problems/55dbfdc246f3f62d6a7bcee7664cacf6be345527/1


class Solution
{
	public static int addMinChar(String str){
		int n = str.length();
        int i = 0, j = n - 1, ans = n - 1;
        
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                ans--;
                j = ans;
            }
        }
        
        return n - ans - 1;
	}
}
