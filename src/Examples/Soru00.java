package Examples;

import java.util.Scanner;

public class Soru00 {
    // girilen bir sayının armastrong sayı olup olmaıdğını kontrol et
    // örnek 1634 = 1*4 + 6*4 + 3*4 + 4*4
    //         371 = 3*3 + 7*3 + 1*3
    // basamak sayısı çarpı basamaktaki sayi = sayı

    // do-while döngüsü ile yap

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();


        armaStrongSayi(sayi);

    }

    public static void armaStrongSayi(int sayi) {

        int toplam = 0;
        int basamakSayi = 0;

        do {
            int basamakDegeri = sayi %10;
            sayi /= 10;
            toplam+= Math.pow(basamakSayi,basamakDegeri);

        }while (sayi >0);
        if (sayi == toplam){
            System.out.println("Bu sayi bir armaStrong sayıdır. ");
        }else {
            System.out.println("Bu sayi bir armaStron sayi değildir");
        }

    }
}
