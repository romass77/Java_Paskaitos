package lt.bit;

import java.util.Scanner;

public class Keltas {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Laukenciu automobiliu skaicius:");
        int auromobiliaiLaukia = sc.nextInt();



        System.out.println("Kiek telpa i kelta per karta:");
        int telpaIKelta = sc.nextInt();
        if (telpaIKelta < 0) {
            System.out.println("Minusinis skaicius automobiliu kelte negali buti");
        }else if (telpaIKelta > 0) {
            System.out.println("Telpa i kelta per karta: "+ telpaIKelta);
        }else {
            System.out.println("Tuscias keltas nekelia");
        }


        int reisuSkaicius = auromobiliaiLaukia / telpaIKelta;
        int likoKrante = auromobiliaiLaukia - reisuSkaicius * telpaIKelta;

        if (auromobiliaiLaukia < 0){
            System.out.println("Ivestas neigiamas skaicius");
        }else if (auromobiliaiLaukia > 0){
            System.out.println("Kelto reisu skaicius: "+reisuSkaicius);
            System.out.println("Liko neperketa automobiliu: "+likoKrante);
        }else {
            System.out.println("Ivestas nulis");
        }

    }
}


