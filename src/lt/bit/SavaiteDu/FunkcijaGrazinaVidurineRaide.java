package lt.bit.SavaiteDu;

public class FunkcijaGrazinaVidurineRaide {
    public static void main(String[] args) {

        String[] zodziai = new String[]{"labas", "abc", "langas", "kompiuteris" };
String tekstas ="namas";

char ats = vidurineRaide(tekstas);

System.out.println("vidurine zodzio raide yra: "+ats);

    }

    public static  char vidurineRaide(String x){
        int i = x.length()/2;
       return x.charAt(i);

    }
}