class Solution {
    int lb(int x , int arr[]){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ans  =mid;
                high =mid-1;
            }
            else if(arr[mid] > x){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }return ans;

    }
        int ub(int x , int arr[]){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x){
               
                high = mid-1;
                
            }else {
                low = mid+1;
            }
        }return ans;

    }
    public int[] searchRange(int[] arr, int target) {
        int l = lb(target , arr);
        int r = ub(target , arr);
        return new int[]{l, r};

      
        
    }
}