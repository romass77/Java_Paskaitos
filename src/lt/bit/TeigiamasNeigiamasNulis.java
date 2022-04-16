package lt.bit;

import java.util.Scanner;

public class TeigiamasNeigiamasNulis {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Ivesk skaiciu:");
        int skaicius = sc.nextInt();

        if (skaicius > 0) {
            System.out.println("Skaicius yra teigiamas");
        } else if (skaicius <0) {
            System.out.println("Skaicius yra neigiamas");
        } else {
            System.out.println("Skaicius lygus nuliui");
        }

    }
}
