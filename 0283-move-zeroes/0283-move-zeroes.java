class Solution {
    public void moveZeroes(int[] nums) {
        int k=0; //pointer for non-zero elements
        
         //loop to set non zero elements first
            for(int i=0;i<nums.length;i++) {
                if(nums[i]!=0) {
                    nums[k]=nums[i];
                    k++;
                }
            }
         //Filling rest of array with 0
            for(int i=k;i<nums.length;i++) {
                nums[i]=0;
            }
            //System.out.print(Arrays.toString(nums));
        }
}