class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
        return true;

        String str="";
        String rev="";

        s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str=str+ s.charAt(i);
                rev=s.charAt(i) + rev;
            }
        }
        if(str.equals(rev)) {
            return true;
        }
        return false;
    }
}