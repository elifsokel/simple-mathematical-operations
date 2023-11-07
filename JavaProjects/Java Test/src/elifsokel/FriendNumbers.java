package elifsokel;

public class FriendNumbers {
    public static void main(String[] args) {
        int limit = 10000;

        System.out.println("Arkadaş Sayılar:");
        for (int i = 1; i <= limit; i++) {
            int total1 = sumOfDivisors(i);

            if (total1 != i) {
                int total2 = sumOfDivisors(total1);

                if (total2 == i && i < total1) {
                        System.out.println(i + " ve " + total1);
                }
            }
        }
    }
    public static int sumOfDivisors (int number){
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}