package lt.bit;

import java.util.Scanner;

public class ForCiklas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("ivesk skaiciu ciklui:");
            int skaicius = sc.nextInt();

            for (int i = 0; i <= skaicius; i++){
                System.out.println("is "+i);
            }
        }
    }