 LEET CODE 1482
PROBLEM : Minimum Number of Days to Make m Bouquets 


import java.util.*;
public class Solution {

    static int func(int arr[] , int mid , int b , int r){
        int cnt = 0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            if(mid >=arr[i])cnt++;
            else {
                total+=cnt/b;
                cnt=0;
            }

        }total+=cnt/b;

        if(total>=r)return 1;
        else return -1;
    }
    public static int roseGarden(int[] arr, int r, int b) {
       if(r*b>arr.length)return -1;
       int low = Arrays.stream(arr).min().getAsInt();
       int high  =Arrays.stream(arr).max().getAsInt();
       int ans = 0;
       while(low<=high){
           int mid = (low+high)/2;
           if(func(arr , mid , r , b) ==1){
               ans = mid;
               high =mid-1;
           }else low= mid+1;
       }return ans;

    }
}