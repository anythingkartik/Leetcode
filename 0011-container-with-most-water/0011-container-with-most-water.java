class Solution {
    public int maxArea(int[] height) {

        int maxWater=0;
        int waterArea;

        int n=height.length;
        int left=0;
        int right=n-1;

        while(left<right) {
            waterArea=(int)(Math.min(height[left], height[right]))*((right-left));
            if(waterArea>maxWater){
                maxWater=waterArea;
            }
            if(height[left]>height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return maxWater;

    }
}