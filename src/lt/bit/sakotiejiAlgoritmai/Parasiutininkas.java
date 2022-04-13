package lt.bit.sakotiejiAlgoritmai;

import java.util.Scanner;

public class Parasiutininkas {

    public static void main(String[] args) {
        // writ
        Scanner myScaner = new Scanner(System.in);

        System.out.println("Parasiutininkas soka is aukscio :");
       double aukstisH = myScaner.nextDouble();

        double g = 9.8;



double laikasPerKuriNukrenta = Math.sqrt((2*aukstisH)/g);

       System.out.println(laikasPerKuriNukrenta);

       for (int i=0;i<=laikasPerKuriNukrenta; i++){
double greitis =Math.pow(g,2);
           System.out.println(greitis);
       }

        }
}



