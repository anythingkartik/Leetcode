class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> elements=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(elements.contains(nums[i]))
            return true;
            else
            elements.add(nums[i]);
        }
        return false;
    }
}


/*class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);  

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] == nums[i - 1]) 
            {
                return true;  
            }
        }
        return false;  // No duplicate found :)
    }
}
*/
        