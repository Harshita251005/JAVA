import java.util.*;

public class Recursion {
    public static int printNumb(int x, int n) {
        // if (n == 0) {
        // return;
        // }
        // System.out.println(n);
        // printNumb(n - 1);

        // if (n == 6) {
        // return;
        // }
        // System.out.println(n);
        // printNumb(n + 1);

        // if (i == n) {
        // sum += i;
        // System.out.println(sum);
        // return;
        // }
        // sum += i;
        // printNumb(i + 1, n, sum);
        // System.out.println(i);
        // if (n == 1 || n == 0) {
        // return 1;
        // }

        // int fact_num1 = printNumb(n - 1);
        // int fact_n = n * fact_num1;
        // return fact_n;

        // if (n == 0) {
        // return;
        // }
        // int c = a + b;
        // System.out.println(c);
        // printNumb(b, c, n - 1);

        // if (n == 0) {
        // return 1;
        // }
        // if (x == 0) {
        // return 0;
        // }
        // int xPownm1 = printNumb(x, n - 1);
        // int xPownm = x * xPownm1;
        // return xPownm;

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printNumb(x, n / 2) * printNumb(x, n / 2);
        } else {
            return printNumb(x, n / 2) * printNumb(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        // int n = 5;
        // int n = 1;
        // printNumb(n);
        // printNumb(1, 5, 0);
        // int ans = printNumb(n);
        // System.out.println(ans);

        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7;
        // printNumb(a, b, n - 2);

        int x = 2, n = 5;
        int ans = printNumb(x, n);
        System.out.println(ans);
    }
}