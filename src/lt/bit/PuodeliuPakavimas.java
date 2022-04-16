package lt.bit;

import java.util.Scanner;

public class PuodeliuPakavimas {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Puodeliu kuriuos reikia supakuoti skaicius:");
        int puodeliuSkaicius = sc.nextInt();
        int vntDezeje = 3;

        int pilnuDeziuSkaicius = puodeliuSkaicius / vntDezeje;
        int likoNesupakuota = puodeliuSkaicius - pilnuDeziuSkaicius * vntDezeje;

        if (puodeliuSkaicius < 0){
            System.out.println("Ivestas neigiamas skaicius");
        }else if (puodeliuSkaicius > 0){
            System.out.println("Pilnu deziu skaicius: "+pilnuDeziuSkaicius);
            System.out.println("Liko nesupakuota: "+likoNesupakuota);
        }else {
            System.out.println("Ivestas nulis");
        }

    }
}
