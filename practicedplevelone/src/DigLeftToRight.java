import java.util.Scanner;

public class DigLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int inputArray[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inputArray[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[n][m];

        for (int j = inputArray[0].length - 1; j >= 0; j++) {
            for (int i = inputArray.length - 1; i >= 0; i++) {
                if (j == inputArray[0].length - 1) {
                    dp[i][j] = inputArray[i][j];
                } else if (i == 0) {
                    dp[i][j] = inputArray[i][j] + Math.max(dp[i][j + 1], inputArray[i + 1][j + 1]);
                } else if (i == inputArray.length - 1) {
                    dp[i][j] = inputArray[i][j] + Math.max(dp[i][j + 1], inputArray[i - 1][j + 1]);
                } else {
                    dp[i][j] = inputArray[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
                }
            }
        }
        int max = dp[0][0];
        for (int i = 1; i < dp.length; i++) {
            if (max < dp[i][0]) {
                max = dp[i][0];
            }
        }

        System.out.println(max);
    }
}
