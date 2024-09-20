class Solution {
    public String removeOuterParentheses(String s) {
        int startcounter=0;
        int endcounter=0;

        StringBuilder str=new StringBuilder();

        int pos=0;

        if(s.isEmpty()) {
            return "";
        }
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                startcounter+=1;
            }
            if(s.charAt(i)==')') {
                endcounter+=1;
            }

            if(startcounter==endcounter) {
                str=str.append(s.substring(pos+1,i));
                startcounter=0;
                endcounter=0;
                pos=i+1;               
            }
        }
        return str.toString();
    }
}