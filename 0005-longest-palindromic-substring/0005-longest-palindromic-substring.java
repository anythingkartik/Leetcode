class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0; // Indices for the longest palindrome
        for (int i = 0; i < s.length(); i++) {
            // Expand around a single character (odd-length palindrome)
            int len1 = expandAroundCenter(s, i, i);
            // Expand around two characters (even-length palindrome)
            int len2 = expandAroundCenter(s, i, i + 1);
            // Take the maximum length
            int maxLen = Math.max(len1, len2);

            // Update start and end indices if a longer palindrome is found
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        // Return the longest palindrome substring
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters match and indices are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }
}
