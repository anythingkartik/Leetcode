class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        int r1=0;
        int r2=0;
        int r3=0;
        int k=0;

        String[] ans=new String[words.length];

        for(int i=0;i<words.length;i++) {
            String wd=words[i].toLowerCase();
            for(int j=0;j<wd.length();j++) {
                char ch=wd.charAt(j);
                if(row1.indexOf(ch) != -1){
                    r1++;
                }
                else if(row2.indexOf(ch) != -1){
                    r2++;
                }
                else {
                    r3++;
                }
            }
            if(r1==wd.length() || r2==wd.length() || r3==wd.length()) {
                ans[k]=words[i];
                k++;
            }
            r1=0;
            r2=0;
            r3=0;
        }
        return java.util.Arrays.copyOfRange(ans, 0, k);

    }
}