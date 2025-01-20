import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // output
        System.out.println("Hello World");

        // variables
        // String name ="Harshita";
        // double price =28.87;
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        // // input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // sc.nextLine();
        // sc.nextint();
        // sc.nextfloat();
        System.out.println(name);
        sc.close();
    }

}
