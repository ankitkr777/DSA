Question - Max Consecutive Ones - I
Link  -https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int cnt = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                ans = Math.max(ans , cnt);
            }
            else {
                cnt = 0;
            }
        }return ans;
        
    }
}