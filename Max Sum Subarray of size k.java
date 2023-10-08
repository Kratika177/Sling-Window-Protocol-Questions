/*
Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
*/

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> arr,int N){
        
        long sum=0;
        long m=Integer.MIN_VALUE;
        int j=0,i=0;
        for(j=0;j<N;j++){
            sum+=(long)arr.get(j);
            if(j-i+1==K){
                m=Math.max(m,sum);
                sum-=(long)arr.get(i);
                i++;
            }
        }
        return m;
    }
}
