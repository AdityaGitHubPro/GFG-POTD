Question Link: https://practice.geeksforgeeks.org/problems/even-swap/1



class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
		//Write your code here
		boolean flag = true;
		while(flag){
		    flag = false;
		    for(int i=0; i<n-1; i++){
		        if((arr[i]+arr[i+1])%2 == 0){
		            if(arr[i] < arr[i+1]){
		                int temp = arr[i+1];
		                arr[i+1] = arr[i];
		                arr[i] = temp;
		                flag = true;
		            }
		        }
		    }
		}
		return arr;
	}
}
