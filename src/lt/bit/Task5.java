package lt.bit;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int skaicius = sc.nextInt();

        for (int i = 2; i < skaicius; i++) {
            int couter =0 ;
            for ( int j=i; j>=2; j--){
                if (i % j == 0) {
                  couter++;
                   // System.out.println("pirminis " +i);
                }
            }
            if(couter == 1){
                System.out.println("Pirminis " +i);
            }
        }


    }
}