package lt.bit;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu n");
        int skaiciusN = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= skaiciusN; i++) {
            sum = 1 + 1.0 / i;
            System.out.println("N SUMA " + sum);

        }

    }
}