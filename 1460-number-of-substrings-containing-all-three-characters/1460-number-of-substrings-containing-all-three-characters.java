class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int result = 0;
        int[] count = new int[3]; // To count 'a', 'b', 'c' in the window
        
        for (int right = 0; right < s.length(); right++) {
            // Increment the count of the current character in the window
            count[s.charAt(right) - 'a']++;
            
            // While the window contains at least one of each character
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // All substrings from left to right are valid, so add the count
                result += s.length() - right;
                
                // Move left pointer to shrink the window
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        
        return result;
    }
}
