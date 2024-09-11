class Solution {
    public String reverseWords(String s) {
       
        String[] list = s.trim().split("\\s+");
        // \\s means "a space" and + means "one or more spaces in a row"
        int len=list.length;
        String[] wd=new String[len];

        for(int i=0;i<len;i++) {
            wd[len-1-i]=list[i];
        }
      
       String rev=String.join(" ", wd);
       return rev;
    }
}