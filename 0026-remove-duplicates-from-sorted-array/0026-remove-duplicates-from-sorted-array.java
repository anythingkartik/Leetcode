class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                k++;
                nums[k-1]=nums[i];
            }
        }
        return k;
    }
}