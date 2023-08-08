package Examples;

import java.util.Scanner;

public class soru22 {
    public static void main(String[] args) {
        /*
        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen)
        ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
                30 ve 40

        Beklenen Çıktı:
                30 ve 40 için EBOB= 10
                30 ve 40 için EKOK= 120
                                        ipucu:
                                            Loopları kullanarak çözebiliriz.
                                            İki sayının EKOK'u sayıların çarpımının
                                            sayıların EBOB'una bölünerek bulunabilir.
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int ebob = 0;
        int ekok = 1;

        System.out.println(ebobhesapla(sayi1, sayi2));
        System.out.println(ekokHesaplama(sayi1, sayi2));

        for (int i = 2; i < sayi1; i++) {
            for (int j = 2; j < sayi2; j++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                    break;
                }
                ekok = sayi1*sayi2;
            }
        }
        System.out.println("En büyük ortak böleni: " +ebob);
        System.out.println("En küçük ortak katı: " +ekok);
    }
    public static int ebobhesapla (int sayi1,int sayi2){
        while (sayi2 != 0){
            int gecici = sayi2;
            sayi2= sayi1% sayi2;
            sayi1 = gecici;
        }
        return sayi1;
    }
    public static int ekokHesaplama (int sayi1, int sayi2){
        return (sayi1 * sayi2)/ebobhesapla(sayi1,sayi2);
    }
}


