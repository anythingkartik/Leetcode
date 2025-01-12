class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       s=s.substring(s.lastIndexOf(' ')+1);
       int len=s.length();
       return len;
    }
}


