class Solution {
    public int peakIndexInMountainArray(int[] nums) {

        int start = 0;
        int end = nums.length-1;
        
        while (start<end) {
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]) {
                // you are in decreasing part of array
                // this may be the ans but look for left also 
                // this is why end  = mid -1
                end = mid;
            } else {
                // you are in ascending part of your array
                start = mid +1;// bcs mid +1 is greater than 
            }
        }
        // in the end start == end and pointing to the largest elements i.e peak ele 
        return start;

        // int low = 1;
        // int high = nums.length-2;
        // int ans = 0;
        // while(low<=high) {
        //     int mid = low + (high-low)/2;

        //     if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
        //          ans = mid;
        //     }
        //     else if(nums[mid] > nums[mid-1] && nums[mid] >nums[mid+1] ) {
        //         low = mid +1;
                
        //     }
        //     else {
        //         high = mid -1;
        //     }
        // }
        // return ans;
        // int lo = 1, hi = arr.length-2;
        // while(lo<=hi){
        //     int mid = (lo+hi)/2;
        //     if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) return mid;
        //     else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
        //     else hi = mid-1;
        // }
        // return 7569;
    }
}