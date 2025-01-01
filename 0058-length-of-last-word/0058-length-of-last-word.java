class Solution {
    public int lengthOfLastWord(String s) {
        // Remove extra spaces and trim the string
        String str = s.replaceAll("\\s+", " ").trim();
        
        // Find the index of the last space
        int ind = str.lastIndexOf(' ');
        
        // If there is no space, the whole string is the last word
        if (ind == -1) {
            return str.length();
        }
        
        // Get the substring after the last space and return its length
        String wrd = str.substring(ind + 1);
        return wrd.length();
    }
}
