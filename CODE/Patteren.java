import java.util.Scanner;

public class Patteren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (i == n - 1 || j == m - 1 || i == 0 || j == 0) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = n-1; j >=i; j--) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i <n; i++) {
        // for (int j = n-1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for(int j=0;j<=i;j++)
        // {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print(j);
        // }
        // System.out.println(" ");
        // }

        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);
        // num++;
        // }

        // System.out.println(" ");
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n - i - 1);
        //     for (int j = 0; j < spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }

        //     int spaces = 2 * (n - i );
        //     for (int j = 0; j <spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n-1;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     for(int j=n-1;j>i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }



        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(i + " ") ;
        //     }
        //     System.out.println("");
        // }



        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--)
        //     {
        //         System.out.print(j) ;
        //     }
        //     for(int j=2;j<=i;j++)
        //     {
        //         System.out.print(j) ;
        //     }
        //     System.out.println("");
        // }



        // for(int i=0;i<=n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     int star=2*i-1;
        //     for(int j=0;j<star;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=n;i>=0;i--)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     int star=2*i-1;
        //     for(int j=0;j<star;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     int star=2*i-1;
        //     for(int j=0;j<star;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=n;i>0;i--)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     int star=2*i-1;
        //     for(int j=0;j<star;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

    
        sc.close();
    }
}
