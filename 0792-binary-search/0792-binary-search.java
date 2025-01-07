class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return bs(nums,target,s,e);
    }
        static int bs(int[] nums,int target,int s,int e) {
            if(s>e) {
                return -1;
            }
            int mid=s+(e-s)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(target<nums[mid]) {
                return bs(nums,target,s,mid-1);
            }

            return bs(nums,target,mid+1,e);
        }
}