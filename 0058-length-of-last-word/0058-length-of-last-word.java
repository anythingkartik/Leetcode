class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.trim().split("\\s+");
        String last=words[words.length-1];
        return last.length();
    }
        /*
       s=s.trim();
       s=s.substring(s.lastIndexOf(' ')+1);
       int len=s.length();
       return len;
    }*/
}


