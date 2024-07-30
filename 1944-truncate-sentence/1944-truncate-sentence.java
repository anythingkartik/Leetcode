class Solution {
    public String truncateSentence(String s, int k) {
        s=s.trim();
        String[] words = s.split(" ");
        int x=0;
        String wd="";
        for(int i=0;i<k;i++)
        {
            if(i==(k-1))
            wd=wd+(words[i]); 
            else  
            wd=wd+(words[i])+" "; 
        }
    return wd;
    }
}