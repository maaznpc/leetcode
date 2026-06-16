class Solution {
    public int searchInsert(int[] nums, int target) {
        int high,low,mid;
        high =nums.length-1;
        low =0;
        while(low<=high){
            mid = low + (high - low) / 2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                high =mid-1;
            }else{
                low =mid+1;
            }
        }
        return low;
    }
}
