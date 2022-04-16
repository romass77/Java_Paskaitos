package lt.bit.SavaiteDu;

import java.util.Scanner;

public class FunkcijaGrazinaMaziausiaIrDidziausiaMasyvoSkaiciu {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);
        int[] masyvas = new int[]{10, 45, 5, 3, 56, 19, 7,245,1,30};

        int min = gautiMinReiksme(masyvas);
        System.out.println("Minimali masyvo reiksme yra: " + min);
        int max = gautiMaxReiksme(masyvas);
        System.out.println("Maksimali masyvo reiksme yra: " + max);

    }

    public static int gautiMinReiksme(int[] x) {

        // 1 budas
        int minReiksme = Integer.MAX_VALUE;

        // 2 budas
        //int minReiksme = x[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] < minReiksme) {
                minReiksme = x[i];
            }
        }
        return minReiksme;
    }
    public static int gautiMaxReiksme(int[] x) {
        int maxReiksme = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxReiksme) {
                maxReiksme = x[i];
            }
        }
        return maxReiksme;
    }

}