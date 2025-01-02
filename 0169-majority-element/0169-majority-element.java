class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int i:nums) {
            freq.put(i,freq.getOrDefault(i,0)+1);

             if (freq.get(i)> n/2)
             return i;
        }
        return -1;
    }
}