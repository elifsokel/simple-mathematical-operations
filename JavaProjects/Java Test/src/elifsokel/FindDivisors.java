package elifsokel;

import java.util.Scanner;

public class FindDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bölenlerini bulmak istediğiniz sayıyı girin: ");
        int number = scanner.nextInt();

        System.out.println("Bölenler:");
        findDivisors(number);

        scanner.close();
    }
    public static void findDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}