import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;

        List<List<Integer>> pascalsTriangle = solution.generate(numRows);

        // Printing the generated Pascal's Triangle
        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}
