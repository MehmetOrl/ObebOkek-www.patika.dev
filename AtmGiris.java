import java.sql.SQLOutput;
import java.util.Scanner;
public class AtmGiris {
    public static void main(String[] args) {
        Scanner atm=new Scanner(System.in);

        String userName,password;
        int islem,pCekme,bky,miktar;
        int bakiye=10000;
        int hak=3;
        while(hak>0)
        {
        System.out.print("Kullanıcı adınızı giriniz.:");
        userName=atm.nextLine();
        System.out.print("Şifrenizi  giriniz.:");
        password=atm.nextLine();
       if(userName.equals("mehmet")&&password.equals("147"))
       {
           System.out.println("Lütfen Yapmak istediğiniz işlemi seçin");
           System.out.println("1-Para çekme\n2-Para Yatırma\n3-Bakiye sorgulama\n4-Çıkış yap");
           islem=atm.nextInt();
           switch (islem)
           {

               case 1:
                   System.out.println("Çekmek istedğiniz  miktarı giriniz.:");
                   pCekme=atm.nextInt();
                   if(pCekme<=bakiye)
                   {
                       bky=bakiye-pCekme;
                       System.out.println("paranız aktarılıyor.:");
                       System.out.println("Bakiyeniz.:"+bky);
                   }
                   else
                   {
                       System.out.println("Bakiyeniz yetersiz");

                   }
                   break;
               case 2:
                   System.out.print("Yatırmak İstediğiniz Miktarı giriniz.:");
                   miktar=atm.nextInt();
                   bky=bakiye+miktar;
                   System.out.println("Yeni Bakiyeniz.:"+bky);
                   break;
               case 3:
                   System.out.println("Bakiyeniz.:"+bakiye+"Türk Lirası");
                   break;
               case 4:
                   System.out.println("Bankamızı Kullandığınız İçin Teşekkür Ederiz :)");
                   hak=0;
                   break;

           }

       }
       else
       {
           userName=null;
           password =null;
           System.out.println("Yanlış Girdiniz Tekrar Deneyniz");
           hak--;
           if(hak==0){
               System.out.println("Hesabınız Bloke Olmuştur Lütfen Bankamızla İrtibata Geçin");
       }
           else
           {
               System.out.println("Kalan hakkınız.:"+hak);
           }
       }
        }


    }
}
