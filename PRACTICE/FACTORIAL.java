import java.util.*;
public class FACTORIAL {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close(); 
       int fact=1;
       for(int i=1;i<=n;i++){
        fact=fact*i;
       }
       System.out.print(fact);
    }
}
