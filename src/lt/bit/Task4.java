package lt.bit;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int skaicius = sc.nextInt();

        for (int i = 1; i <= skaicius; i++){
          if(i % 3 == 0 && i%7 == 0){
              System.out.println("Fizz Buzz");
          }else if(i % 3 == 0){
              System.out.println("Fizz");
            }else if (i % 7 ==0){
              System.out.println("Buzz");
          }else {
              System.out.println("skaicius "+i+" nesidalina is 7 ir 3");
          }
        }

    }
}
