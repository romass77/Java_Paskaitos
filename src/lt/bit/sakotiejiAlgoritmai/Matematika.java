package lt.bit.sakotiejiAlgoritmai;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Matematika {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);

        System.out.println("Ivesti is kiek pazimiu skiciuosite vidurki: ");
        int pazimiuSkaicius = myScaner.nextInt();

     //   int[] pazimiuMasyvas = new int[pazimiuSkaicius];

//int sum =0;
  //      System.out.println("Ivesti is paziumius: ");
  //      for (int i = 1; i <= pazimiuMasyvas.length; i++) {
  //         int ivedamiPazimiai = myScaner.nextInt();
  //          pazimiuMasyvas[i] = ivedamiPazimiai;
   //         sum =+pazimiuMasyvas[i];

    //    }
      //  System.out.println("The sum is " + sum);

   // antras variantas
        System.out.println("Ivesti 5 pazimius:");
        int pazimis1 = myScaner.nextInt();
        int pazimis2 = myScaner.nextInt();
        int pazimis3 = myScaner.nextInt();
        int pazimis4 = myScaner.nextInt();
        int pazimis5 = myScaner.nextInt();

        double vidurkis = (double)(pazimis1+pazimis2+pazimis3+pazimis4+pazimis5)/5;

        if (vidurkis > 9){
            System.out.println("Gaus trys saldainius");
        }else  if (vidurkis>=7 && vidurkis<=9){
            System.out.println("Gaus du saldainius");
        }else {
            System.out.println("Gaus viena saldaini");
        }

        }
    }