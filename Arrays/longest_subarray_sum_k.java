Question - LONGEST SUBARRAY WITH SUM K
Link - https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399

public class Solution {
    public static int longestSubarrayWithSumK(int []arr, long k) {
        // Write your code here
        int right = 0;
        int left =0;
        long sum = 0;
        int ans = 0;
        int n = arr.length;
        while(right< arr.length){
            sum+=arr[right];

            if(sum==k){
                ans = Math.max(ans , right-left+1);
            }
            right++;
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
           

        }return ans;
    }
}