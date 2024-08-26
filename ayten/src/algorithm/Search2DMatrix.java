package algorithm;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) return true;
            else if (target < matrix[r][c]) c--;
            else r++;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix solution = new Search2DMatrix();
        int[][] nums = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean result=solution.searchMatrix(nums, 0);
        if(result){
            System.out.println("Searched number found in 2D array");
        }
        else System.out.println("Searched not found");
    }
}
