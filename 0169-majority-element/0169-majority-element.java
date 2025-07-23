class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=0;

        for(int i=0;i<nums.length;i++) {
            if(count == 0) {
                majority=nums[i];
                count++;
            }
            else{
                if(nums[i] != majority) 
                {
                  count -=1;
                }
                else 
                {
                count +=1;
                }
            }
        }
        return majority;
    }
}