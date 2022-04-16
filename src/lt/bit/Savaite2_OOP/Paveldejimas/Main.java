package lt.bit.Savaite2_OOP.Paveldejimas;

public class Main {
    public static void main(String[] args) {
       Pastatas pastatas = new Daugiabutis(50.5,2500,
               "gyvenamas");
System.out.println(pastatas.getBendrasPlotas()+" "+pastatas.
        getKvadratinioMetroKaina()+" "+pastatas.getPastatoTipas());
    }
}
