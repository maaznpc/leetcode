class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        if(k==nums.length){
            for(int i: nums){
                ans=Math.max(ans,i);
            }
            return ans;
        }
        
        if (k == 1) {
    // Find the largest value occurring exactly once
    for (int i = 0; i < nums.length; i++) {
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        if (count == 1) {
            ans = Math.max(ans, nums[i]);
        }
    }

    return ans;
}
        if (nums[0] == nums[nums.length - 1]) {
    int count = 0;

    for (int x : nums) {
        if (x == nums[0]) count++;
    }

    return count == 1 ? nums[0] : -1;
}
        int count1=0;
        int count2=0;
        for(int j: nums){
           if(j==nums[0]){
               count1++;
           }else if(j==nums[nums.length -1]){
               count2++;
           }
        }
        if(count1==1&&count2==1){
            return Math.max(nums[0],nums[nums.length-1]);
        }
        else if(count1>1&&count2==1){
            return nums[nums.length-1];
        }else if(count1==1&&count2>1){
            return nums[0];
        }else{
            return -1;
        }   
    }
}
