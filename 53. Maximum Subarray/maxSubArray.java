class Solution {
    public int maxSubArray(int[] nums) {
        int global = nums[0];
        int current = nums[0];
        for(int i = 1; i<nums.length;i++){
            current = Math.max(nums[i], nums[i]+current);
            global = Math.max(current,global);
        }
        return global;
        
    }
}
