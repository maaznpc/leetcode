class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=0;min<nums[nums.length-1];i++){
            if(nums[i]!=min){
                ans.add(min);
                i--;
            }
            min++;
        }
        return ans;
    }
}
