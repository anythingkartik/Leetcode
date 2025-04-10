/*class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int actualSum=(int)(len*(len+1))/2;
        int missingSum=0;
        for(int i=0;i<len;i++) {
            missingSum+=nums[i];
        }
     return (actualSum-missingSum);
    }
}*/

class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;

        // XOR all numbers from 0 to n
        for (int i = 0; i <=n; i++) {
            xor1 ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xor2 ^= num;
        }

        // Missing number is the XOR of the above two
        return xor1 ^ xor2;
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