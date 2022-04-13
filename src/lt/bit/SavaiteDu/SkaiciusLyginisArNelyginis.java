package lt.bit.SavaiteDu;

import java.util.Scanner;

public class SkaiciusLyginisArNelyginis {

    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);
        int skaicius = 101;
        boolean skaiciausLyginimas = arLyginis(skaicius);

        System.out.println("Skaicius " + skaicius);
        System.out.println(skaiciausLyginimas);


    }

    public static boolean arLyginis(int x) {
        if ((x % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}