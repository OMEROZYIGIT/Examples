package Examples;

import java.util.Scanner;

public class soru17 {
    /*
    Soru 17-)
                Kullanıcıdan bir isim isteyelim.
                Bu isim 3 harfli olmalıdır.
                Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
                İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
                değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz: ");
        String isim = scan.nextLine();

        for (int i = 0; i < isim.length() ; i++) {
            if (isim.charAt(0)==isim.charAt(1) || isim.charAt(1)==isim.charAt(2)) {
                System.out.println("Dize yinelenen karakterlere sahip");
            }else {
                System.out.println("Dize benzersiz karakterlere sahip");

        }
           break;
        }
    }
}
