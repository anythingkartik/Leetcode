class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack to store indices
        
        for (int i = 0; i < n; i++) {
            // While stack is not empty and current temperature is greater than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop(); // Get the index of the previous day
                answer[index] = i - index; // Calculate the difference in days
            }
            stack.push(i); // Push the current index onto the stack
        }
        
        // Remaining indices in the stack will have 0 as they have no warmer day ahead
        return answer;
    }
}