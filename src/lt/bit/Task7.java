package lt.bit;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite indeksa");
        int indexNumber = scanner.nextInt();

        int [] fibonaciNumbers = new int[indexNumber + 1];
        fibonaciNumbers[0] = 0;
        fibonaciNumbers[1] = 1;

        for(int i = 0; i < indexNumber; i++){
            int j = i + 1;
            int k = j + 1;

            if(k > indexNumber){
                break;
            }

            fibonaciNumbers[k] = fibonaciNumbers[i] + fibonaciNumbers[j];
        }

        System.out.println(fibonaciNumbers[indexNumber]);
    }
}
