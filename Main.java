import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,tepNumber,value,toplam=0;

        System.out.println("Sayı giriniz.:");
        number=input.nextInt();
        tepNumber=number;
        while (tepNumber!=0)
        {
            value=tepNumber%10;
            toplam+=value;
            tepNumber/=10;
        }
        System.out.println(toplam);



    }
}