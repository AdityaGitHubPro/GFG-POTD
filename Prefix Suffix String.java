class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        int c = 0;
        for (String i : s2) {
            for (String j : s1) {
                if (j.contains(i)) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
