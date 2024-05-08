public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result; 
        }
        
        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;
        
        while (row_start <= row_end && col_start <= col_end) {
            // Traverse top row from left to right
            for (int col = col_start; col <= col_end; col++) {
                result.add(matrix[row_start][col]);
            }
            row_start++;
            
            // Traverse right column from top to bottom
            for (int row = row_start; row <= row_end; row++) {
                result.add(matrix[row][col_end]);
            }
            col_end--;
            
            // Traverse bottom row from right to left
            if (row_start <= row_end) {
                for (int col = col_end; col >= col_start; col--) {
                    result.add(matrix[row_end][col]);
                }
                row_end--;
            }
            
            // Traverse left column from bottom to top
            if (col_start <= col_end) {
                for (int row = row_end; row >= row_start; row--) {
                    result.add(matrix[row][col_start]);
                }
                col_start++;
            }
        }
        
        return result;
    }
}
