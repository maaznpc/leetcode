class Solution { 
    public int missingInteger(int[] nums) {
        int prefix=nums[0];
        int i=1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
            prefix += nums[i];
            i++;
        }

        Set<Integer> h =new HashSet<>();
        for(int num : nums){
            h.add(num);
        }
        while(h.contains(prefix)){
            prefix++;
        }
        return prefix;
    }
}
