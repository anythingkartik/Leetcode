import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        // Array to store the minimum frequency of each character
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Iterate through each word
        for (String word : words) {
            int[] charFreq = new int[26];

            // Count frequency of each character in the current word
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }

            // Update the minimum frequency for each character
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }

        // Build the result list based on minFreq
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}
