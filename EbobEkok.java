import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner ek=new Scanner(System.in);
        int s1,s2, s3=1;
        int ebob = 0;
        int ekok;
        System.out.println("Birin ci sayıyı giriniz.:");
        s1=ek.nextInt();
        System.out.println("İkinci Sayıyı Giriniz.:");
        s2=ek.nextInt();

               while (s3<=s1)
                   {

                       if(s1%s3==0&&s2%s3==0)
                       {
                           ebob=s3;
                       }
                       s3++;
                   }
               System.out.println("ebob:"+ebob);

               ekok=(s1*s2)/ebob;
               System.out.println("ekok:"+ekok);



    }
}
