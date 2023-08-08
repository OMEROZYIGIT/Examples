package Examples;

import java.util.Scanner;

public class soru12 {
    /*
    Soru 12-)
            Verilen iki sayının toplamını sıfırdan büyük veya eşit olabilir-
            hesaplamak ve yazdırmak için bir program oluşturalım
            Eğer verilen tamsayıların toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
            Ipucu:  IF/Else kullanabilirsiniz.
                    Örnek:
                        İki tamsayı girin:
                        25 veya 4567986321453
                        46 veya 123456
                        Konsolda Çıktı :
                        Sayıların toplamı: 71 veya Fazla Yüklenme

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamını istediğiniz 2 tam sayi giriniz:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int toplam = sayi1+sayi2;
        int basamakSayisi = 0;
        int sayac = 0;

        if (toplam>1000000000){
            System.out.println("Toplam: " + toplam + " Fazla yüklenme");
        }else {
            System.out.println(toplam);
        }

    }
}
