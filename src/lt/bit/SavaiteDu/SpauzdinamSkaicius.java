package lt.bit.SavaiteDu;


import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class SpauzdinamSkaicius {
    // Sukurti metoda spausdintiSkaiciusNuoIki(x, y)
    // spausdintiSkaiciusNuoIki(1, 100) -> 1,2,3,4,5...100
    // spausdintiSkaiciusNuoIki(-100, 100) -> -100,-99,-98...100
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);

        System.out.println("Ivesti pirma masyvo skaiciu:");
        int reiksmeX = myScaner.nextInt();
        System.out.println("Iveskite paskutini masyvo skaiciu:");
        int reiksmeY = myScaner.nextInt();

        int[] skaiciuMasyvas = new int[reiksmeY];


        int[] gautasMayvas = uzpildomMasyva(skaiciuMasyvas);
        System.out.println(Arrays.toString(gautasMayvas));

        System.out.println("Masyvas nuo " + reiksmeX + " iki " + reiksmeY + " yra:");
        spauzdintiMasyva(gautasMayvas, reiksmeX);

    }

    public static int[] uzpildomMasyva(int[] masyvas) {
        for (int i = 1; i <= masyvas.length; i++) {
            masyvas[i - 1] = i;
        }
        return masyvas;
    }

    public static void spauzdintiMasyva(int[] nMasyvas, int reiksmeX) {
        for (int i : nMasyvas) {
            if (i >= reiksmeX)
                System.out.print(i + ", ");
        }

    }
}