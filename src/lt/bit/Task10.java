package lt.bit;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int ivestasSkaicius = scanner.nextInt();
//        String skaiciusTikString = String.valueOf(ivestasSkaicius);
//        char[] skaiciai = skaiciusTikString.toCharArray();
//
//        int suma = 0;
//        for(char skaicius : skaiciai){
//            suma += Integer.parseInt(String.valueOf(skaicius));
//        }
//
//        System.out.println("Suma: " + suma);
        int suma = 0;

        while(ivestasSkaicius>0){
            int digit = ivestasSkaicius % 10;
            // suma = suma + digit
            suma += digit;
            // skaicius = skaicius / 10;
            ivestasSkaicius /= 10;
        }

        System.out.println("Suma: " + suma);
    }
}

