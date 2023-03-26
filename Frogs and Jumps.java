Question Link: https://practice.geeksforgeeks.org/problems/5551749efa02ae36b6fdb3034a7810e84bd4c1a4/1



class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean b=false;
        for(int i=0;i<N;i++)
        {
            if(frogs[i]==1)
            b=true;
        }
        if(b)
        return 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<N;i++)
        {
            if(hs.contains(frogs[i]))
            continue;
            if(hs.size()==leaves)
            break;
            for(int j=frogs[i];j<=leaves;j+=frogs[i])
            hs.add(j);
        }
        return leaves-hs.size();
    }
}
