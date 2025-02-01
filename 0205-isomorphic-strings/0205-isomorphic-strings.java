import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Step 1: Create a HashMap to map characters from s to t
        HashMap<Character, Character> map = new HashMap<>();

        // Convert both strings to character arrays
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        // Step 2: Fill the HashMap with character mappings from s to t
        for (int i = 0; i < ch1.length; i++) {
            char sChar = ch1[i];
            char tChar = ch2[i];

            // Check if the sChar is already mapped
            if (map.containsKey(sChar)) {
                // If it's mapped, ensure the mapping is consistent
                if (map.get(sChar) != tChar) {
                    return false;  // Mismatch in mapping, return false
                }
            } else {
                // If it's not mapped, make sure tChar is not already mapped to another sChar
                if (map.containsValue(tChar)) {
                    return false;  // tChar is already mapped, so return false
                }
                // Add the new mapping
                map.put(sChar, tChar);
            }
        }

        // Step 3: Now create a new string by mapping t back to s using the reverse lookup
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);

            // Find the corresponding key in the map for the current character in t
            for (char key : map.keySet()) {
                if (map.get(key) == tChar) {
                    newString.append(key);  // Append the key to newString
                    break;
                }
            }
        }

        // Step 4: Compare the newly constructed string with the original string s
        return newString.toString().equals(s);
    }
}
