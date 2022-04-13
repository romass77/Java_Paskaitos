package lt.bit;

import java.util.Scanner;

public class Gimtadienis {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Iskiepe sausainiu:");
       int iskepeSausainiu = sc.nextInt();

        System.out.println("Draugu skaicius kurie atsinese tiek pat sausainiu:");
        int draugaiKurieAtneseSausainiu = sc.nextInt();

        System.out.println("Sventeja dalyvavo viso zmoniu:");
        int sventesDalyviai = sc.nextInt();

        int sausainiaiBendrai = iskepeSausainiu + draugaiKurieAtneseSausainiu * iskepeSausainiu;
        int kiekSausainiuGavoKiekvienas = sausainiaiBendrai / sventesDalyviai ;
        int kiekSausainiuPasilikoSauPapildomai  = sausainiaiBendrai - kiekSausainiuGavoKiekvienas * sventesDalyviai ;

        System.out.println("Kiekvienas gavo po " +kiekSausainiuGavoKiekvienas+ " sausainius");
        System.out.println("Seimininkui liko papildomai " +kiekSausainiuPasilikoSauPapildomai+
                " tai viso " +(kiekSausainiuPasilikoSauPapildomai+kiekSausainiuGavoKiekvienas));
    }
}