Question Link: https://practice.geeksforgeeks.org/problems/badefd58bace4f2ca25267ccfe0c9dc844415e90/1



class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(!s.isEmpty() && ((s.peek() >= 0 && arr[i] < 0) || (s.peek() < 0 && arr[i] >= 0))){
                s.pop();
                continue;
            }
            s.push(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!s.isEmpty()){
            ans.add(s.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
