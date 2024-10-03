class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++) {  //for (int num : nums) Directly access all
            result=result^nums[i];
        }
        return result;
    }
}