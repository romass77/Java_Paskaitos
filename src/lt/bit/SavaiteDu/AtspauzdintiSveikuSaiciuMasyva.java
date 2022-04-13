package lt.bit.SavaiteDu;

import java.util.Scanner;

public class AtspauzdintiSveikuSaiciuMasyva {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);

        int[] svekiejiSkaiciai = new int[10];
        svekiejiSkaiciai[0] = 1;
        svekiejiSkaiciai[4] = 99;
        svekiejiSkaiciai[svekiejiSkaiciai.length - 1] = 100;

        spasuzdintiSveikuosiusSkaicius(svekiejiSkaiciai);
    }

    public static void spasuzdintiSveikuosiusSkaicius(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }
}