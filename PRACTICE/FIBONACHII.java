import java.util.* ;
public class FIBONACHII{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int F0=0;
    int F1=1;
    System.out.print(F0+" "+F1);
    for(int i=2;i<n;i++)
    {
        int F2=F0+F1;
        System.err.print(" "+F2);
        F0=F1;
        F1=F2;
    }
    sc.close();
}
}