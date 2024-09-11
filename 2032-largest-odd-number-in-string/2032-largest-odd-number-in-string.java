class Solution {
    public String largestOddNumber(String num) {
        int flag=0;
        String wd=" ";
        for(int i=num.length()-1;i>=0;i--) {
            char ch= num.charAt(i);
            int n=ch-'0';
            if(n%2!=0) {
                wd=num.substring(0,i+1);
                flag=1;
                break;
            }
        }
        if(flag==0) {
            return "";
        }
        return wd;
    }
}