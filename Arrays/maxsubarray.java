class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans = Math.max(sum ,ans);
            if(sum<0)sum=0;
        }
        return ans;
        
    }
}