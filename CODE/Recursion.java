import java.util.*;

// public class Recursion {
//     public static int printNumb(int x, int n) {
//         // if (n == 0) {
//         // return;
//         // }
//         // System.out.println(n);
//         // printNumb(n - 1);

//         // if (n == 6) {
//         // return;
//         // }
//         // System.out.println(n);
//         // printNumb(n + 1);

//         // if (i == n) {
//         // sum += i;
//         // System.out.println(sum);
//         // return;
//         // }
//         // sum += i;
//         // printNumb(i + 1, n, sum);
//         // System.out.println(i);
//         // if (n == 1 || n == 0) {
//         // return 1;
//         // }

//         // int fact_num1 = printNumb(n - 1);
//         // int fact_n = n * fact_num1;
//         // return fact_n;

//         // if (n == 0) {
//         // return;
//         // }
//         // int c = a + b;
//         // System.out.println(c);
//         // printNumb(b, c, n - 1);

//         // if (n == 0) {
//         // return 1;
//         // }
//         // if (x == 0) {
//         // return 0;
//         // }
//         // int xPownm1 = printNumb(x, n - 1);
//         // int xPownm = x * xPownm1;
//         // return xPownm;

//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         if (n % 2 == 0) {
//             return printNumb(x, n / 2) * printNumb(x, n / 2);
//         } else {
//             return printNumb(x, n / 2) * printNumb(x, n / 2) * x;
//         }
//     }

//     public static void main(String[] args) {
//         // int n = 5;
//         // int n = 1;
//         // printNumb(n);
//         // printNumb(1, 5, 0);
//         // int ans = printNumb(n);
//         // System.out.println(ans);

//         // int a = 0, b = 1;
//         // System.out.println(a);
//         // System.out.println(b);
//         // int n = 7;
//         // printNumb(a, b, n - 2);

//         int x = 2, n = 5;
//         int ans = printNumb(x, n);
//         System.out.println(ans);
//     }
// }

// public class Recursion{

//     public static void towerofHanoi(int n, String src,String helper, String dest) {
//         if(n==1)
//         {
//             System.out.println("transfer disk" + n + " from " + src + " to " +  dest );
//             return;
//         }
//         towerofHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk" + n + " from " + src  + " to " + dest );
//         towerofHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         towerofHanoi(n, "S", "H","D");
//     }
// }

// public class Recursion{

//     public static void printRev(String str, int idx) {
//         if(idx==0)
//         {
//             System.out.println(str.charAt(idx) );
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);;
//     }
// }


// public class Recursion {

//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurance(String str, int idx, char element) {
//         if (idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (currChar == element) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         findOccurance(str, idx + 1, element);
//     }

//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findOccurance(str, 0, 'a');
//     }
// }



// public class Recursion{

//     public static boolean isSorted(int arr[], int idx){
//         if(idx== arr.length-1)
//         {
//             return true;
//         }

//         if(arr[idx]<arr[idx+1])
//         {
//             return isSorted(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,7,5};
//         System.out.println(isSorted(arr, 0));
//     }
// }



// public class Recursion{

//     public static void moveAllx(String str, int idx, int count, String newString){
//         if(idx== str.length())
//         {
//             for(int i=0;i<count;i++)
//             {
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }

//        char currChar= str.charAt(idx);
//        if(currChar == 'x'){
//         count++;
//         moveAllx(str, idx+1, count, newString);
//        }
//        else{
//         newString +=currChar;
//         moveAllx(str, idx+1, count, newString);
//        }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllx(str, 0, 0, "");
//     }
// }


// public class Recursion{

//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicate(String str, int idx, String newString){
//         if(idx== str.length())
//         {
//             System.out.println(newString);
//             return;
//         }

//        char currChar= str.charAt(idx);
//        if(map[currChar - 'a']){
//         removeDuplicate(str, idx+1, newString);
//        }
//        else
//        {
//         newString +=currChar;
//         map[currChar-'a'] = true;
//         removeDuplicate(str, idx+1, newString);
//        }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxddfdggfsafd";
//         removeDuplicate(str,0, "");
//     }
// }



// public class Recursion{

//     public static void subsequence(String str, int idx, String newString){
//         if(idx== str.length())
//         {
//             System.out.println(newString);
//             return;
//         }

//        char currChar= str.charAt(idx);

//        subsequence(str, idx+1, newString+currChar);
//        subsequence(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str,0, "");
//     }
// }




// public class Recursion{

//     public static void subsequences(String str, int idx, String newString, HashSet<String>set){
//         if(idx== str.length())
//         {
//             if(set.contains(newString))
//             {
//                 return;
//             }
//             else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }          
//         }

//        char currChar= str.charAt(idx);

//        subsequences(str, idx+1, newString+currChar, set);
//        subsequences(str, idx+1, newString, set);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         HashSet<String> set = new HashSet<>();
//         subsequences(str,0, "",set);
//     }
// }




// public class Recursion{

//     public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mon", "pqrs"," tu" ," vwx", "yz"};

//     public static void printComb(String str, int idx, String combination){
//         if(idx== str.length())
//         {
//             System.out.println(combination);
//             return;
//         }

//        char currChar= str.charAt(idx);
//        String mapping = keypad[currChar - '0'];

//        for(int i=0;i<mapping.length();i++)
//        {
//         printComb(str, idx+1, combination+mapping.charAt(i));
//        }

//     }
//     public static void main(String[] args) {
//         String str = "4";
//         printComb(str,0, "");
//     }
// }



// public class Recursion{


//     public static void printPerm(String str,String permutation){
//         if(str.length()==0)
//         {
//             System.out.println(permutation);
//             return;
//         }

//        for(int i=0;i<str.length();i++)
//        {
//         char currChar= str.charAt(i);
//         String newStr = str.substring(0, i) + str.substring(i+1);
//         printPerm(newStr, permutation+currChar);
//        }

//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         printPerm(str, "");
//     }
// }




// public class Recursion{

//     public static int countPaths(int i, int j, int n, int m){
//         if(i==n || j==m)
//         {
//             return 0;
//         }
//         if(i==n-1 && j==m-1)
//         {
//             return 1;
//         }
//         int downPaths = countPaths(i+1, j, n, m);
//         int rightPaths = countPaths(i, j+1, n, m);
//         return downPaths + rightPaths;

//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println(totalPaths);
//     }
// }



// public class Recursion{

//     public static int placeTiles(int n, int m){
//         if(n==m)
//         {
//             return 2;
//         }
//         if(n<m)
//         {
//             return 1;
//         }
//         int vertPlacements = placeTiles(n-m, m);
//         int horPlacements = placeTiles(n-1, m);
//         return vertPlacements + horPlacements;

//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         System.out.println(placeTiles(n, m));
//     }
// }


// public class Recursion{

//     public static int callGuest(int n){
//         if(n<=1)
//         {
//             return 1;
//         }
        
//         int way1 = callGuest(n-1);
//         int way2= (n-1) * callGuest(n-2);
//         return way1 + way2;

//     }
//     public static void main(String[] args) {
//         int n=4;
//         System.out.println(callGuest(n));
//     }
// }


