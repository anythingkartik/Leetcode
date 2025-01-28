import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case: Add the first row [1]
        if (numRows >= 1) {
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1); // First row
        }

        // Generate each row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            // First element of every row is 1
            currentRow.add(1);

            // Compute the middle elements using the previous row
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element of every row is 1
            currentRow.add(1);

            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle;
    }
}
