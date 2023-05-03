package baekjoon.bronze;

import java.util.Scanner;

public class Num_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();

            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
