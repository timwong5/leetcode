package JianzhiOfferProject.Day06;

/**
 * @author timwong5
 * @date 2022-08-03 10:41
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //matrix.length表示行数
        //matrix[0].length表示列数
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int columns = matrix[0].length;

        if (matrix != null && rows > 0 && columns > 0) {
            int i = 0;
            int j = columns - 1;
            while (i < rows && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    j = j - 1;
                } else if (matrix[i][j] < target) {
                    i++;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        Solution solution = new Solution();
        System.out.println(solution.findNumberIn2DArray(matrix, -5));
    }
}
