package elifsokel;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1;
        double sayi2;
        double sonuc;
        String operator;

        System.out.print("İlk sayıyı girin: ");
        sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextDouble();

        System.out.print("Toplama (+), Çıkarma (-), Çarpma(*) ve Bölme (/) işlemlerinden birini seçin: ");
        operator = scanner.next().toString();

        switch (operator) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz operatör!");
                return;
        }
        System.out.print("Sonuç: " + sonuc);
    }
}