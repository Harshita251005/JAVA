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
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println("The array is: ");
        // for (int i = 1; i < n - 1; i++) {
        // for (int j = 1; j < m - 1; j++) {

        // if (arr[i][j] == 0) {
        // if (arr[i][j - 1] == 1 && arr[i - 1][j] == 1 && arr[i][j + 1] == 1 && arr[i +
        // 1][j] == 1) {
        // row_index = i;
        // col_index = j;

        // }
        // }
        // }
        // }
        // System.out.println(" index is : [" + row_index + "]" + "[" + col_index +
        // "]");

        // TIC TAC TOE

        // System.out.println("Welcome To Tic Tac Toe");
        // int n=3;
        // int m=3;
        // char [][] arr=new char [n][m];
        // System.out.println("Enter Your Input: ");
        // for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++)
        // {
        //     if(arr[i][0] == arr[i][j])
        //     if(arr[0][j] == arr[i][j])
        // }
        // }

        // for(int i = 0;i<m;i++){
        //     // if(arr[0][0] == arr[i][i])
        //     if(arr[0][m-1] == arr[i][m-i-1])
        // }

        // JAVA CLASS
        // int n=sc.nextInt();
        // int [] arr = new int[n];
        // for(int i=0;i<n;i++)
        // {
        // arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++)
        // {
        // System.out.println(arr[i]);
        // }
        // System.out.println("Length of an Array is :- ");
        // System.out.println(arr.length)

        // do while not work in arrary

        // int i=0;
        // do{
        // System.out.println(arr[i]);
        // }
        // while(i<10);

        // Max Element

        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }
        // int max = arr[0];

        // for (int i = 1; i < n; i++) {

        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);

        // array with 1 indexing

        // int n = sc.nextInt();
        // int[] arr = new int[n+1];
        // for (int i = 1; i <= n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // for (int i = 1; i <= n; i++) {
        // System.out.println(arr[i]);
        // }

        // search an element in 1-D array

        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i <n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int x=sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // if(x==arr[i])
        // System.out.println(i);
        // }

        // search in 2-D array

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();

        // }
        // }
        // }
        // int x = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // {
        // for (int j = 0; j < m; j++) {
        // if (x == arr[i][j])
        // System.out.println(i + "," + j);
        // }
        // }

        // }

        // find the one duplicate in given array with conditions(array size(n+1),input
        // elements (0 to n-1))

        // int n = sc.nextInt();

        // int[] arr = new int[n + 1];
        // for (int i = 0; i < n + 1; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // int act = 0;
        // for (int i = 0; i < n + 1; i++) {
        // sum = sum + arr[i];
        // }
        // for (int i = 0; i < n; i++) {
        // act = act + i;
        // }
        // System.out.println(sum - act);

        // find the two duplcate no. in array

        // int n=sc.nextInt();
        // int []arr=new int[n+2];
        // for(int i=0;i<n+2;i++)
        // {
        // arr[i]=sc.nextInt();
        // }
        // Arrays.sort(arr);
        // for(int i=0;i<n+1;i++)
        // {
        // if(arr[i]==arr[i+1])
        // {
        // System.out.println(arr[i]);
        // }
        // }

        // second method of this same question
        // int n = sc.nextInt();
        // int[] a = new int[n + 3];
        // for (int i = 1; i <= n + 2; i++) {
        // a[i] = sc.nextInt();
        // }
        // for (int i = 1; i <= n + 2; i++) {
        // a[Math.abs(a[i])] *= -1;
        // }
        // for (int i = 1; i <= n; i++) {
        // if (a[i] > 0) {
        // System.out.println(i);
        // }
        // }

        // jacked array(in which there are different no. of columns in each row)
        // 2D array
        // we can also initialize it by
        // int[][] arr1 = new int[3][];
        // // now it will create one 1-D array with all elements as NULL.

        // for (int i = 0; i < 3; i++) {
        // int col = sc.nextInt();
        // int[] c = new int[col];
        // for (int j = 0; j < col; j++) {
        // c[j] = sc.nextInt();
        // }
        // arr1[i] = c;
        // }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < arr1[i].length; j++) {
        // System.out.print(arr1[i][j] + " ");

        // }
        // System.out.println();
        // }

        // spiral matrix

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // int top=0;
        // int bottom=m-1;
        // int left=0;
        // int right=n-1;
        // while(top<=bottom && left<=right)
        // {
        // for(int i=left;i<=right;i++)
        // {
        // System.out.print(arr[top][i] + " " );
        // }
        // top++;
        // for(int i=top;i<=bottom;i++)
        // {
        // System.out.print(arr[i][right] + " " );
        // }
        // right--;
        // if(left<=right)
        // {
        // for(int i=right;i>=left;i--)
        // {
        // System.out.print(arr[bottom][i] + " ");
        // }
        // bottom--;
        // }
        // if(top<=bottom)
        // {
        // for(int i=bottom;i>=top;i--)
        // {
        // System.out.print(arr[i][left] + " ");
        // }
        // left++;
        // }
        // System.out.println();
        // }

        // wave pattern

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if (i % 2 == 0) {
        //         for (int j = 0; j < m; j++) {
        //             System.out.print(arr[j][i]);
        //         }
        //     } else {
        //         for (int j = m - 1; j >= 0; j--) {
        //             System.out.print(arr[j][i]);
        //         }
        //     }

        // }

        sc.close();
    }
}
