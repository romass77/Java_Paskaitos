package lt.bit;

import java.util.Scanner;

public class Automobilis {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double tunelioIlgis = 264;
        System.out.println("Automobilio Greitis:");
        double automobilioGreitis = sc.nextDouble();




        double laikas =(tunelioIlgis/1000)/automobilioGreitis*3600 ;
        System.out.println("Laikas perkuri pramaziuojama tuneli:" +laikas);


    }
}

