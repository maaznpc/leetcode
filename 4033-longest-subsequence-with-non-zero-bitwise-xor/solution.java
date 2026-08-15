class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        boolean hasnozero=false;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(nums[i]!=0){
                hasnozero=true;
            }
        }
        if(! hasnozero){
            return 0;
        }
        if(xor!=0){
            return nums.length;
        }
        return nums.length-1;
    }
}
