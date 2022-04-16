package lt.bit;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite svori:");
        float svoris = sc.nextFloat();

        System.out.println("Iveskite ugi(centimetrais):");
        int ugis = sc.nextInt();


      double ugisMetrais = (double) ugis/100;
     double bmi = svoris/Math.pow(ugisMetrais,2);

// || - OR
// && - END
     if (bmi >= 18.5 && bmi <=24.9) {
            System.out.println("BMI is optimal");
        } else {
            System.out.println("BMI not optimal");
        }

    }

}