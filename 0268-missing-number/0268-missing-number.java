class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int actualSum=(int)(len*(len+1))/2;
        int missingSum=0;
        for(int i=0;i<len;i++) {
            missingSum+=nums[i];
        }
     return (actualSum-missingSum);
    }
}

/*class Solution {
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
}*/