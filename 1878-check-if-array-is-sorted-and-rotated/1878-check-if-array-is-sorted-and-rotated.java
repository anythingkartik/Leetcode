class Solution {
    public boolean check(int[] nums) {
      int drop=0;
      for(int i=0;i<nums.length-1;i++) {
        if(nums[i]>nums[i+1]) {
            drop+=1;
        }
      }
      
      if(nums[nums.length-1]>nums[0])
      drop+=1;

      if(drop<=1) {
        return true;
      }
        return false;
    }
}