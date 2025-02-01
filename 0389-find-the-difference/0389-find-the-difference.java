class Solution {
    public char findTheDifference(String s, String t) {


        HashMap<Character,Integer> map1=new HashMap<>();

        for(char ch:s.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch,0)+1); 
        }  

        for(char ch:t.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch,0)-1);  
        }  

        for(char ch:map1.keySet()) {
            if(map1.get(ch)!=0) {
                return ch;
            }
        }

    return '\u0000';
    }
}