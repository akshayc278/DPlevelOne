import java.util.Scanner;

import static java.lang.Math.min;

public class StairCaseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputArrayLength = sc.nextInt();
        int[] inputArray = new int[inputArrayLength];
        for (int i = 0; i < inputArrayLength; i++) {
            inputArray[i] = sc.nextInt();
        }
        Integer dp[] = new Integer[inputArrayLength + 1];
        dp[inputArrayLength] = 0;

        for (int i = inputArrayLength - 1; i >= 0; i--) {
            if (inputArray[i] > 0){
                int stepsCanGo = inputArray[i];
                for(int j= 1 ;j<=stepsCanGo;j++){
                    if(i+j>inputArrayLength)
                        break;
                    if(dp[i+j] == null)
                        continue;
                    dp[i]=Integer.MAX_VALUE;
                    dp[i]=min(dp[i],dp[i+j]);
                }
                dp[i]=dp[i]+1;
                //System.out.print(dp[i]+"-"+i+",");
            }
        }
        System.out.println(dp[0]);
    }
}
