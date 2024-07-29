class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;  // Duplicate found
            }
        }
        return false;  // No duplicates found
    }
}

/*for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                return true;
            }
        }
        return false;
        
        
        
         String s=Arrays.toString(nums);
        for(int i=0;i<nums.length;i++)
        {
            String ss=Integer.toString(nums[i]);
            if(s.contains(ss))
            {
            return true;
            }
        }
        return false;*/