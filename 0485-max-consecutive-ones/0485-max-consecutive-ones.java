class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1 ) {
                count=count+1;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        return Math.max(max, count); //what if arrays ends with bunch of 1s and not 0 , then it will print old max value
    }
}