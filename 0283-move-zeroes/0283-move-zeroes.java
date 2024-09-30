class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        if(nums.length==1 && nums[0]==0) {
            System.out.print(nums);
        }
        else {
            for(int i=0;i<nums.length;i++) {
                if(nums[i]!=0) {
                    nums[k]=nums[i];
                    k++;
                }
            }
            for(int i=k;i<nums.length;i++)
            {
                nums[i]=0;
            }
            System.out.print(Arrays.toString(nums));
        }
        
    }
}