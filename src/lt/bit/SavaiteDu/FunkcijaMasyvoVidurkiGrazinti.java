package lt.bit.SavaiteDu;

import java.util.Scanner;

public class FunkcijaMasyvoVidurkiGrazinti {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);

        int[] masyvas = new int[]{2, 3, 999, 6};
        double vid = masyvoElementuVidurlis(masyvas);
        System.out.println(vid);
    }
    public static double masyvoElementuSuma(int[] x) {
        int suma = 0;
        for (int i = 0; i < x.length; ++i) {
            suma = suma + x[i];
        }
        return suma;
    }
    public static double masyvoElementuVidurlis(int[] x) {
        double suma = masyvoElementuSuma(x);

        return suma / x.length;
    }
}