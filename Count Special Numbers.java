Question Link: https://practice.geeksforgeeks.org/problems/3d49e4cce2820a813da02d1587c2dd9c542ce769/1


class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        Map<Integer,Integer> hm =new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<N;i++)
        {
          hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        int cnt =0;
        for(Map.Entry<Integer, Integer> e:hm.entrySet())
        {
          if(e.getValue()>1) {
            cnt+=e.getValue();
          }
          else {
            for(int i=0;i<N;i++)
            {
              if(e.getKey()>arr[i]&&e.getKey()%arr[i]==0)
              {
                cnt++;
                break;
              }
            }
          }
        }

        return cnt;
      }
}
