package Examples;

import java.util.Scanner;

public class soru18 {
    /*
    Soru 18-) Method Sorusu
            Girilen araç hızı ve yol kilometresinden,
            gidilen yere varış süresini hesaplayan bir method yazalım.
            Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
                İpucu:
                yol=Hız*zaman

     */
    public static void main(String[] args) {

       varisSuresi(50,400);
        System.out.println(hesaplaVarisSuresi(50, 400));


    }
    public static void varisSuresi(int hiz, int km){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arac hizini giriniz: ");
        int hız = scanner.nextInt();
        System.out.println("Lutfen kalan yol kmsini giriniz: ");
        int yol =scanner.nextInt();

        int  sure = yol/hiz;
        System.out.println(sure);

    }
    public static double hesaplaVarisSuresi (double hiz, double yol){

        return yol/hiz;
    }
}

