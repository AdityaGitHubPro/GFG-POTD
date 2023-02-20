Question Link: https://practice.geeksforgeeks.org/problems/aa0000a5f710ce8d41366b714341eef644ec7b82/1


class Solution{

  public static int countPaths(int N){

 //code here

    int m = 1000000007;

    long ans = 0;

    for(int i=2;i<=N;i++){

      if(i%2==0){

         ans=(ans%m*3%m)%m+3;

      }
      else{

          ans=(ans%m*3%m)%m-3;

      }

    }

    return (int)ans%m;

  }

}
