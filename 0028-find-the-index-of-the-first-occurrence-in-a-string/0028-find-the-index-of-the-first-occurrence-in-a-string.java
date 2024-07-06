class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        // Iterate through haystack until there's not enough space for needle
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; //If you do substring(i,needleLength), needleLength is fixed dumbo
            }
        }
        return -1;
    }
}
