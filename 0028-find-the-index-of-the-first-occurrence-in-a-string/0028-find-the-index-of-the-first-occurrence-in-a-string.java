class Solution {
    public int strStr(String haystack, String needle) {
          if (needle.isEmpty()) {
            return 0; // Per problem requirements, return 0 if needle is empty
        }
        return haystack.indexOf(needle);
    }
}