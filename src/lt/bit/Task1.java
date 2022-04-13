package lt.bit;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite apskritimo diametra:");
        float apskritimoDiametras = sc.nextFloat();



double perimetras = apskritimoDiametras * Math.PI;
        System.out.println("Perimetras yra: "+perimetras);

    }
}