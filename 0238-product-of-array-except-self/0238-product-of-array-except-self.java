class Solution {
    public int[] productExceptSelf(int[] nums) {

    int n = nums.length;
    int[] answer = new int[n];

    // Step 1: Compute prefix product
    answer[0] = 1; // No left elements for the first element
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    // Step 2: Compute suffix product and combine with prefix
    int suffix = 1; // Start with no right elements for the last element
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * suffix; // Combine prefix and suffix
        suffix *= nums[i]; // Update suffix product
    }

    return answer;

        /*int index=0;
        
        int[] answer=new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            int k=0;
            int mul=1;
            while(k<nums.length) {
                if(k!=index) {
                    mul=mul*nums[k];
                    answer[i]=mul;
                }
                k++;
            }
            index++;
        }
        return answer;
    }*/
    }
}