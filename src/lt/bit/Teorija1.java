package lt.bit;

import java.util.Scanner;

public class Teorija1 {
    public static void main(String[] args) {
        // writ
        Scanner sc = new Scanner(System.in);


            // Primityvus duomenų tipai - jų yra 8.

            // Skirtumas tarp jų - koks yra ilgis.
            // Default reikšmė yra 0.
            byte bytuSkaicius = 122;
            short trumpasSkaicius = 1231;
            // nuo -2147483648 iki 2147483647
            int a = 1002;
            // final tai galutinis, keisti reikmes negalime
            final int galutinisSkaicius = 123;

            long ilgasSkaicius = 123123324234L;

            // Downcasting ir uppercasting
            int kazkoksSkaicius = bytuSkaicius;
            int darKazkoksSkaicius = (int) ilgasSkaicius;

            // default -> 0.0
            // Skaiciai su kableliu
            double b = 132.84;
            float d = 123.34F;

            // false default reikšmė
            // loginis kintamasis (true or false)
            // angliski kintamuju pavadinima -> boolean turi prasideti su zodeliu is, pvz: isAlive, isExist.
            boolean c = true;

            // čia gali priimti ASCI Code
            char simbolis = 'x';

            // Matematines operacijos
            // + - * / %
            int suma = 5 + 2;
            int atimti = 6 - 3;
            int daugyba = 4 * 10;
            int dalyba = 100 / 20;
            int modulus = 7 % 2;

            // increament and decreament
            int randomSkaicius = ++suma;
            int kitasRandomSkaicius = suma--;

            System.out.println(randomSkaicius++);
            System.out.println(randomSkaicius);

//         camel case. pirmas zodis is mazosios, antras is didziosios, bet jie visi kartu.
            Scanner manoScanner = new Scanner(System.in);
            System.out.println("iveskite skaiciu: ");
            int ivestasSkaicius = manoScanner.nextInt();

            // Sąlyginiai sakiniai.
            if (ivestasSkaicius > 10) {
                System.out.println("Skaicius yra didesnis uz 10");
            } else {
                System.out.println("Skaicius yra mazesnis uz 10");
            }

            // Switch
            System.out.println("Iveskite menesio pavadinimą");
            String menesioPavadinimas = manoScanner.next();
            switch (menesioPavadinimas) {
                case "Sausis", "Vasaris" -> System.out.println("Ziema");
                case "Kovas" -> System.out.println("Pavasaris");
                default -> System.out.println("Nesupratau, koks menesis?");
            }

            // default reiksme -> null
            String tekstas = "Mano tekstas";
            String tekstas1 = "Mano tekstas";
            String tekstas2 = new String("Mano tekstas");

            String manoKitasTekstas = null;

            if (manoKitasTekstas != null) {
                System.out.println(manoKitasTekstas.concat(manoKitasTekstas));
            }

            System.out.println(tekstas == tekstas1);
            // Visiems objektams naudojame equals metodą.
            System.out.println(tekstas.equals(tekstas2));

            // String yra immutable
            String manoTekstas = "labukas";
            System.out.println(manoTekstas.toUpperCase());
            System.out.println(manoTekstas);

            // Ciklai
            // for -> inicilizuoja kintamaji (1 karta), tikrina sąlyginas (kiekviena karta), vykdo komanda, padidina vienetu

            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("Skaicius " + i + " yra lyginis");
                } else {
                    System.out.println("Skaicius " + i + " yra nelyginis");
                }
            }

            int manoSkaicius = 0;

            while (manoSkaicius < 100) {
                System.out.println(manoSkaicius);
                manoSkaicius++;
            }

            do {
                System.out.println(manoSkaicius);
                manoSkaicius++;
            } while (manoSkaicius < 100);

            // begalinis ciklas
//        while(true){
//            System.out.println("hello");
//        }

            // Statinis masyvas
            // Masyvas prasideda nuo 0. Indeksas nuo 0.
            //
            int[] skaiciai = new int[10];

            skaiciai[0] = 12;
            skaiciai[1] = 13;
            skaiciai[1] = 14;
            skaiciai[2] = 15;
            skaiciai[3] = 16;
            skaiciai[4] = 13;
            skaiciai[5] = 20;
            skaiciai[6] = 23;
            skaiciai[7] = 213;

            // ilgis yra -> kiek elementų parašę esam.
            int[] skaicia1 = {10, 5, 23};

            // masyvo paskutinis indeksas yra = masyvo ilgis - 1

            for (int i = 0; i < skaiciai.length; i++) {
                System.out.println("Skaicius indekse : " + i + " yra : " + skaiciai[i]);
            }

            // CTRL + ALT + L -> formatavimas;
            String[] pasisveikinimai = new String[4];
            pasisveikinimai[0] = "Labas";
            pasisveikinimai[1] = "Czesc";
            pasisveikinimai[2] = "Hello";
            pasisveikinimai[3] = "Bonjour";

            // for each
            for (String pasisveikinimas : pasisveikinimai) {
                System.out.println(pasisveikinimas);
            }

            for (int i = 0; i < pasisveikinimai.length; i++) {
                if (pasisveikinimai[i].contains("L")) {
                    pasisveikinimai[i] = pasisveikinimai[i].replace("L", "l");
                }
            }

            for (int skaicius : skaiciai) {
                System.out.println("SKaicius: " + skaicius);
            }

            pasisveikink();

            int skaiciuSuma = suma(10, 20);

            skaiciuSuma = suma(1, 2, 3, 4, 5);
            skaiciuSuma = suma(1, 2, 3);

            int[] skaiciuMasyvas = {1, 2, 3, 4};
            skaiciuSuma = sumaIsMasyvo(skaiciuMasyvas);

            dalyba = divide(10, 0);

            String[] kandidatoKompetencijos = {"Komandiskumas", "Programavimas", "Duomenu bazes"};
            int siulomaAlga = 0;

//        if(arTuriKompetencija("Komandiskumas", kandidatoKompetencijos)) {
//            siulomaAlga = 1200;
//        } else {
//            siulomaAlga = 500;
//        }

            // Ternory operation
            siulomaAlga = arTuriKompetencija("Komandiskumas", kandidatoKompetencijos) ? 1200 : 500;

            int randomNumber = 123123 < 1301 ? 12312 : 123123 > 234324 ? 234123 : 123123;
        }

        private static boolean arTuriKompetencija (String ieskomaKompetencija, String[]kandidatoKompetencijos){
            for (String kompetencija : kandidatoKompetencijos) {
                if (kompetencija.equals(ieskomaKompetencija)) {
                    return true;
                }
            }

            return false;
        }

        // void - čia tiesiog grąžinimo tipas, kuris negrąžina nieko.
        public static void pasisveikink () {
            System.out.println("Hello");
        }

        public static int suma ( int a, int b){
            return a + b;
        }

        // varargs
        public static int suma ( int...skaiciai){
            int suma = 0;
            for (int skaicius : skaiciai) {
                suma += skaicius;
            }
            return suma;
        }

        public static int sumaIsMasyvo ( int[] skaiciai){
            int suma = 0;
            for (int skaicius : skaiciai) {
                suma += skaicius;
            }

            return suma;
        }

        public static int divide ( int a, int b){
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("Įvyko klaida, nes : " + e.getMessage());
            }

            return 0;
        }
    }
