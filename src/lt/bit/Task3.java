package lt.bit;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite a");
        int a = sc.nextInt();

        System.out.println("Iveskite b");
        int b = sc.nextInt();

        System.out.println("Iveskite c");
        int c = sc.nextInt();

        double delta= Math.pow(b,2) - (4*a*c);
        if (delta < 0){
            System.out.println("Neigiamas delta");
        }else {
            double x1 = (-b - Math.sqrt(delta) / (2 + a));
            double x2 = (-b + Math.sqrt(delta) / (2 + a));
            System.out.println("Delta : " + delta);
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);


        }
    }
}