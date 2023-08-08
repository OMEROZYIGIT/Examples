package Examples;

import java.util.Scanner;

public class soru19 {
    /*
    Soru 19-)  Method Sorusu
                Kullanıcıdan doğum tarihini alınız.
                Burcunu hesaplayan bir method yazınız.
                ipucu:
                Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
     */
    public static void main(String[] args) {

        burcYazdirma(22,10);
    }
    public static void burcYazdirma(int gun,int ay){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen doğum tarihinizi giriniz: (gün-ay)");
        int gun1 = Integer.parseInt(scanner.next());
        int ay1 = scanner.nextInt();





    }
}
