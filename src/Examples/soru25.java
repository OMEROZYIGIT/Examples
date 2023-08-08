package Examples;

public class soru25 {
    public static void main(String[] args) {
        /*
        Alfabeyi konsola yazdırın.
        örnek:
        a b c .. .. .. .. y z
        ipucu: char kullanmak iyi bir fikir olabilir
         */

        char harf = 'a' ;
        for (int i = 0; i <26 ; i++) {
            System.out.print(harf + " ");
            harf++;
        }
    }
}
