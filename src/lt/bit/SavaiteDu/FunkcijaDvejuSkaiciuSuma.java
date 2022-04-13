package lt.bit.SavaiteDu;

import java.util.Scanner;

public class FunkcijaDvejuSkaiciuSuma {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);

        // System.out.println("Ivesti 1 skaiciu: ");
        //double skaicius1 = myScaner.nextDouble();

        // System.out.println("Ivesti 2 skaiciu: ");
        // double skaicius2 = myScaner.nextDouble();

        double suma = saiciuSuma(2.0, 4.0);
        System.out.println(suma);

    }

    public static double saiciuSuma(double x, double y) {

        return x + y;
    }
}

