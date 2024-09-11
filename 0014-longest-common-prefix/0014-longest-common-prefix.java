class Solution {
    public String longestCommonPrefix(String[] strs) {
        String wd=strs[0];

            for(int j=1;j<strs.length;j++) {
                while(!strs[j].startsWith(wd)) 
                {
                  wd=wd.substring(0,wd.length()-1);
                  if(wd.isEmpty()){
                    return wd;
                  }
                }
            }
        return wd;
    }
}