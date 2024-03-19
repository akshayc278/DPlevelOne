import java.util.Scanner;

public class StaireCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] qb = new int [n + 1];
        int result = StaireCase.countPath(n, new int [n+1]);
        System.out.println(result);

    }

    public static int countPath(int n, int[] qb) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (qb[n] > 0) {
            return qb[n];
        }
        int nm1 = countPath(n - 1, qb);
        int nm2 = countPath(n - 2, qb);
        int nm3 = countPath(n - 3, qb);
        int nm = nm1 + nm2 + nm3;

        return nm;
    }
}
