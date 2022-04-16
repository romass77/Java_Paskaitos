package lt.bit.SavaiteDu;

import java.util.Scanner;

/// Sukurti metoda apskaiciuotiPerimetra(x, y)
// Sukurti metoda apskaiciuotiPlota(x, y)
// Iskviesti is main ir atspausdinti rezultata kai krastine x = 4, o krastine y = 3.6
public class StaciakampioPlotas {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);

        System.out.println("Iveskite staciakampio krastine x:");
        double krastineX = myScaner.nextDouble();

        System.out.println("Iveskite staciakampio krastine y:");
        double krastineY = myScaner.nextDouble();

if (krastineX <= 0 || krastineY <= 0){
    System.out.println("Krastines negali buti nuline aba neigiama");
} else {
    System.out.println("Staciakampio perimetras yra: " + perimetroSkaiciavimas(krastineX, krastineY));
    System.out.println("Staciakampo plotas yra: " + plotoSkaiciavimas(krastineX, krastineY));
}

    }

    public static double perimetroSkaiciavimas(double x, double y) {
        
        // 1 variantas kaip galima
        // double perimetras = ((x * 2) + (y * 2));
        // return perimetras;

        // 2 variantas kaip galima
        return x * 2 + y * 2;
    }

    public static double plotoSkaiciavimas(double x, double y) {

       // 1 variantas kaip galima
       // double plotas = x * y;
       // return plotas;

       // 2 variantas kaip galima
        return x * y;
    }

}
