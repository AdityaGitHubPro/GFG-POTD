Question Link: https://practice.geeksforgeeks.org/problems/839d6ba2c2e4c669ba9d9d9f32ad20118937284e/1



class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int n = S.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int upper_count = 0;
            int lower_count = 0;
            for (int j = i; j < n; j++) {
                if (Character.isUpperCase(S.charAt(j))) {
                    upper_count++;
                } else {
                    lower_count++;
                }
                if (upper_count == lower_count) {
                    count++;
                }
            }
        }
        return count;
    }
} 
