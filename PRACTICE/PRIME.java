import java.util.*;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n <= 1) {
            System.out.print("NOT PRIME");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print("NOT PRIME");
                return;
            }
        }

        System.out.print("PRIME");

    }
}