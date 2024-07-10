class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int pos=s.lastIndexOf(' ');
        int len=(s.substring(pos+1)).length();
        return len;
    }
}