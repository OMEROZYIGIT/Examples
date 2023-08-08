package Examples;

import java.util.Scanner;

public class soru26 {
    public static void main(String[] args) {
        /*
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */

        int bolenlerToplami= 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi ; i++) {
            if (sayi % i == 0) {
                bolenlerToplami += i;
            }
        }
        if (sayi == bolenlerToplami){
            System.out.println(sayi + " Mükemmel Sayıdır ");
        }else {
            System.out.println(sayi + " Mükemmel Sayı Değildir");
        }
    }
}
