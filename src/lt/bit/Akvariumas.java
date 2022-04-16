
package lt.bit;

        import java.util.Scanner;

public class Akvariumas {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiek zuvu gyvena akvariume:");
        int zuvuKiekisAkvariume = sc.nextInt();

        System.out.println("Kiek zuvu idedama i akvariuma:");
        int idedamZuvuIakvariumaDiena = sc.nextInt();

        System.out.println("Dienu skaicius:");
        int dienuSkaicius = sc.nextInt();


        int visoZuvu = zuvuKiekisAkvariume + (idedamZuvuIakvariumaDiena * dienuSkaicius);
        System.out.println("Viso zuvu =" + visoZuvu);


        System.out.println("Labas Pasaulis");
    }
}



