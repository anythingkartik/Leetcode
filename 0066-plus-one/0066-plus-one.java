class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            // If the digit is less than 10, return the result
            if (digits[i] < 10) {
                return digits;
            }
            // If the digit becomes 10, set it to 0 (carry over the 1)
            digits[i] = 0;
        }
        
        // If the loop finishes, it means all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }
}
