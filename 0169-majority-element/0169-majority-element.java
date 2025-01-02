class Solution {
    public int majorityElement(int[] nums) {
        int x=0;
        for(int j=0;j<nums.length;j++) {
            int count=0;
          for(int i=j;i<nums.length;i++) {
            if(nums[i]==nums[j]) {
                count++;
            }
          }
        if(count>(nums.length/2)) {
            x=nums[j];
            break;
        }
        }
        return x;
    }
}