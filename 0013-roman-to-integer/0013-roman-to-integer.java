class Solution {
    public int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0; // Total value of the integer
        int prevValue = 0; // Value of the previous Roman numeral

        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                // If the current value is less than the previous value, subtract it
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            prevValue = currentValue; // Update the previous value
        }

        return total;
    }
}