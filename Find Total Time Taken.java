Question Link: https://practice.geeksforgeeks.org/problems/5ae4f296db3e6bb74641c4087d587b6f89d9d135/1



class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        long[] a = new long[n];
        Arrays.fill(a, -1);
        long curr = 0;
        for (int i = 0; i < n; i++) {
            if (a[arr[i] - 1] == -1)
                a[arr[i] - 1] = curr;
            else {
                if (curr < a[arr[i] - 1] + time[arr[i] - 1])
                    curr = a[arr[i] - 1] + time[arr[i] - 1];
                a[arr[i] - 1] = curr;
            }
            curr++;
        }
        return (int) (curr - 1);
    }
}
