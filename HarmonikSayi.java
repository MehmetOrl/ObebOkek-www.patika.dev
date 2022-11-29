import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n;
        System.out.println("N sayısı Giriniz.:");
        n=in.nextDouble();
        double a=0;
        for(double i=1;i<=n;i++)
        {
            a=a+(1/i);
        }
        System.out.println(a);

    }
}
