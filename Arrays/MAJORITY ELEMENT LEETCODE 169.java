MAJORITY ELEMENT LEETCODE 169
https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] arr) {
        int ele = 0;
        int cnt = 0 ;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                ele =arr[i];
                cnt=1;
            }
            else if(ele==arr[i])cnt++;
            else cnt--;
            
        }int n = arr.length;
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele)cnt1++;
        }if(cnt1>n/2)return ele;
        else return -1;
       
}
}