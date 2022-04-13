package lt.bit.sakotiejiAlgoritmai;

import java.util.Scanner;

public class DidziojiKudrineVarle {
    public static void main(String[] args) {
        // writ
        Scanner myScaner = new Scanner(System.in);

        System.out.println("Ivesti varles svori:");
       int varlesSvoris = myScaner.nextInt();

      System.out.println("Ivesti varliu skaiciu:");
        int varliuSkaicius = myScaner.nextInt();
//int svorisGramais = 5*1000;
      int varliuSvoris = varlesSvoris*varliuSkaicius;
       if (varliuSvoris>=5000){
         System.out.println("stebeimui pakanka: "+(double)varliuSvoris/1000+" kg");
       }else if(varliuSvoris<=0){
          System.out.println("ivestas 0 arba neigiamas skaicius");
       }else {
            System.out.println("stebeijimui nepakanka: "+(double)varliuSvoris/1000+" kg");
        }
    }
}