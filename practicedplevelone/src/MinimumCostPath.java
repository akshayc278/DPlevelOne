import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        MinimumCostPath mcp = new MinimumCostPath();
        int output = mcp.provideMinCostPath(matrix);
        System.out.println(output);
    }

    public int provideMinCostPath(int[][] mat) {
        int dp[][] = new int[4][4];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = mat[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = mat[i][j] + dp[i][j + 1];
                } else if (j == dp.length - 1) {
                    dp[i][j] = mat[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + mat[i][j];
                }
            }
        }
        return dp[0][0];
    }
}

/**
 * 2 1 6 3
 * 1 8 1 9
 * 6 2 2 4
 * 9 3 6 8
 * OP 24
 */