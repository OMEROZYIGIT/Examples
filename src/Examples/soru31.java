package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
        /*
        Soru 31-)
            Kullanıcıdan Arrayin uzunlugunu isteyin.
            Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
            İpucu:  Önce uzunluk alıp arrayi oluştur
            daha sonra loop ile kullancıya doldurt
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Array in uzunluğunu giriniz: ");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen Array in elemanlarını giriniz: ");
        int num = scanner1.nextInt();

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Eleman " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Oluşturulan Array: ");
        for (int eleman : arr){

        }
        System.out.println(Arrays.toString(arr));
    }
}

