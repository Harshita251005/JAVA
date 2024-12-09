import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SUM OF AN ARRAY

        // System.out.println("Enter the no. of elements: ");
        // int n = sc.nextInt();
        // int[] arr1 = new int[n];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // System.out.println("The array is: ");
        // for (int num : arr1) {
        // System.out.println(num + " ");
        // }
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum = sum + arr1[i];
        // }
        // System.out.println(sum);

        // INSERT AN ELEMENT IN AN ARRAY

        // System.out.println("Enter the no. of elements: ");
        // int n = sc.nextInt();
        // int[] arr1 = new int[n];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // System.out.println("The array is: ");
        // for (int num : arr1) {
        // System.out.println(num + "");
        // }
        // System.out.println("Enter the index: ");
        // int index = sc.nextInt();
        // System.out.println("Enter the value: ");
        // int value = sc.nextInt();
        // for (int i = n - 1; i > index; i--) {
        // arr1[i] = arr1[i-1];
        // }
        // arr1[index] = value;
        // for (int i : arr1) {
        // System.out.println(i + "");
        // }

        // CREATE 2-D ARRAY

        // System.out.println("Enter the no. of elements: ");
        // int n= sc.nextInt();
        // int m=sc.nextInt();
        // int [][]arr=new int[n][m];
        // System.out.println("Enter the elements: ");
        // for(int i=0;i<n;i++)
        // {
        // for(int j=0;j<m;j++)
        // {
        // arr[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("The array is: ");
        // for(int i=0;i<n;i++)
        // {
        // for(int j=0;j<m;j++)
        // {
        // System.out.println(arr[i][j]);
        // }
        // }

        // DELETE AN ELEMENT
        // System.out.println("Enter the no. of elements: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the index to be deleted: ");
        // int index = sc.nextInt();
        // for (int i = index; i < n - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[n - 1] = 0;
        // System.out.println("The altered array is : ");
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // FINDING ONE SURROUNDED WITH ZERO

        // System.out.println("Enter the no. of elements: ");
        // int row_index = -1;
        // int col_index = -1;
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("The array is: ");
        // for (int i = 1; i < n - 1; i++) {
        //     for (int j = 1; j < m - 1; j++) {

        //         if (arr[i][j] == 0) {
        //             if (arr[i][j - 1] == 1 && arr[i - 1][j] == 1 && arr[i][j + 1] == 1 && arr[i + 1][j] == 1) {
        //                 row_index = i;
        //                 col_index = j;

        //             }
        //         }
        //     }
        // }
        // System.out.println(" index is : [" + row_index + "]" + "[" + col_index + "]");
        sc.close();
    }
}
