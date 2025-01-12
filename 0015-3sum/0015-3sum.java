class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triples = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to make the two-pointer approach easier

        // Edge case: if there are fewer than 3 elements, no triplet can be formed
        if (nums.length < 3) {
            return triples;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1; // The left pointer starts just after 'i'
            int right = nums.length - 1; // The right pointer starts from the end of the array

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Sum of the triplet

                if (sum == 0) {
                    // If the sum is zero, we found a valid triplet
                    triples.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate values for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both pointers inward to search for the next potential pair
                    left++;
                    right--;
                } else if (sum > 0) {
                    // If the sum is greater than zero, move the right pointer leftward
                    right--;
                } else {
                    // If the sum is less than zero, move the left pointer rightward
                    left++;
                }
            }
        }
        return triples;
    }
}
