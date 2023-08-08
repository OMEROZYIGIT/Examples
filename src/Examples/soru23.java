package Examples;

import java.util.Scanner;

public class soru23 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
            Örnek:
                Girdi: 6
                Çıktı: 6!=6*5*4*3*2*1=720
                ipucu: Aldıgınız sayıyı methoda gönderin.
                Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        System.out.println(faktoriyelHesaplama(6));
        System.out.println(faktoriyelHesaplama(7));
    }
    public static int faktoriyelHesaplama(int sayi){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen faktörü hesabı yapmak istediğniz sayı giriniz: ");
        int sayi1 = scanner.nextInt();

        int fk = 1 ;

        for (int i = 1; i <= sayi ; i++) {
            fk *= i;
        }

        System.out.println(sayi+"!: "+fk);
        return fk;
    }

}
