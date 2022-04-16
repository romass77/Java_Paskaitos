package lt.bit;

import java.util.Scanner;

public class Statybininkas {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Sienos ilgis:");
        int sienosIlgis = sc.nextInt();

        System.out.println("Sienos aukstis:");
        int sienosAukstis = sc.nextInt();



        double plytosKvadratinemeMetre = 1/0.02;
        double sienosPlotas = sienosAukstis * sienosIlgis;


        double plytuSkaicius = sienosPlotas * plytosKvadratinemeMetre ;

        System.out.println("Plytos kaina:");
        double plytosKaina = sc.nextDouble();

        double visoPlytuKaina = plytuSkaicius * plytosKaina;

        System.out.println("Viso plutu: " + plytuSkaicius);
        System.out.println("Plytos kainuos " + visoPlytuKaina + " Lt");

    }
}
