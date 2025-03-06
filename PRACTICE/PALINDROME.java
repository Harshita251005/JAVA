import java.util.*;

public class PALINDROME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
        sc.close();

    }
}

// import java.util.*;

// public class PALINDROME{
//     public static boolean isPalindrome(int n) {
//         if (n < 0 || (n % 10 == 0 && n != 0)) return false; // Negative numbers and numbers ending in 0 (except 0) aren't palindromes
        
//         int reversedHalf = 0;
//         while (n > reversedHalf) {
//             reversedHalf = reversedHalf * 10 + n % 10;
//             n /= 10;
//         }

//         return n == reversedHalf || n == reversedHalf / 10; // Handles even and odd digit cases
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if (isPalindrome(n))
//             System.out.println("Palindrome number");
//         else
//             System.out.println("Not a palindrome");

//         sc.close();
//     }
// }

