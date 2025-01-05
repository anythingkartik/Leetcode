class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0; // Pointer for `s`
        for (int i = 0; i < t.length() && k < s.length(); i++) {
            if (s.charAt(k) == t.charAt(i)) {
                k++; // Move pointer in `s` only if there's a match
            }
        }
        return k == s.length(); // If `k` reaches the length of `s`, all characters matched
    }
}
