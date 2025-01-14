/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> backpack=new HashMap<>();
        int maxLength=0;
        int start=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(backpack.containsKey(ch)) {
                start=backpack.get(ch)+1;
                
            }
                backpack.put(ch,i);
                maxLength++;  
                maxLength = Math.max(maxLength, i - start + 1);
            
        }
        return maxLength;
    }
}*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> backpack = new HashMap<>();
        int maxLength = 0;
        int start = 0;  // Left pointer (start of the window)

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is already in the map and within the current window
            if (backpack.containsKey(ch) && backpack.get(ch) >= start) {
                // Move the start pointer to the right of the previous occurrence of ch
                start = backpack.get(ch) + 1;
            }

            // Update the index of the character in the map
            backpack.put(ch, i);

            // Calculate the current window length and update maxLength if necessary
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
