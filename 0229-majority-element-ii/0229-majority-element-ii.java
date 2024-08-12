class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> arr=new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int len=(int)Math.floor(nums.length/3);

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if (hm.get(nums[i]) > len && !arr.contains(nums[i]))
            {
            arr.add(nums[i]);
            }
        }
        return arr;
    }
}