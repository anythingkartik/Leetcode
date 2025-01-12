class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Array is sorted - you can use 2 pointer approach
        int left=0;
        int right=numbers.length-1;
        //extra array to store index
        int[] arr=new int[2];

        while(left<right) {
            if((numbers[left] + numbers[right])==target) {
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            else if(numbers[left]+numbers[right]>target) {
                right=right-1;
            }
            else {
                left=left+1;
            }
        }
        return arr;
     }
}