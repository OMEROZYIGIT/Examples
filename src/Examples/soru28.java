package Examples;

import java.util.Scanner;

public class soru28 {
    public static void main(String[] args) {
        /*
        Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
             Sayı: 1238
             Sayının Tersi: 8321
            İpucu:  Loop kullanabilirsiniz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int tersSayi = 0;

        while (sayi !=0){
            int sonBasamak = sayi%10;
            tersSayi *= 10 ;
            tersSayi +=  sonBasamak;
            sayi /= 10;
        }
         System.out.println(" Sayının Tersi: "+tersSayi);
    }
}
