class Solution{
	int modulo(String s, int m) {
		//Write your code here
		int r = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            r = (r << 1) + (s.charAt(i) - '0');
            r %= m;
        }
        return r;
	}
}
