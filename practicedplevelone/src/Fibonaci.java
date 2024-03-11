public class Fibonaci {
    public static void main(String[] args) {
        int fibValue = fibMemoized(10, new int[10 + 1]);
        System.out.println(fibValue);
    }

    public static int fibMemoized(int n, int[] qb) {
        if (n == 0 || n == 1)
            return n;
        if (qb[n] != 0)
            return qb[n];

        int fibnm1 = fibMemoized(n - 1, qb);
        int fibnm2 = fibMemoized(n - 2, qb);

        qb[n] = fibnm1 + fibnm2;
        System.out.println("Hello "+qb[n]);
        return qb[n];
    }
}
