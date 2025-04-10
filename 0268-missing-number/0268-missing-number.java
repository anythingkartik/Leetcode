class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=0;i<nums.length;i++) {
            if(s!=nums[i]){
                return s;
            }
            s++;
        }
        return s;
    }
}