
package lt.bit;

        import java.util.Scanner;

public class Taupykle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiek monetu po 5ct:");
        double monetosPoPenkis = sc.nextDouble();

        System.out.println("Kiek monetu po 20ct:");
        double monetosPoDvidesimt = sc.nextDouble();

        System.out.println("Kiek monetu po 2Lt:");
        double monetosDuLt = sc.nextDouble();


        double viso = monetosPoPenkis*0.05 +monetosPoDvidesimt*0.2+monetosDuLt*2;
        System.out.println("Viso pinigu =" +viso);
    }

}

