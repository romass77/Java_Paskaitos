package lt.bit.SavaiteDu;

public class FunkcijaGrazinaIlgiausiaZodi {
    public static void main(String[] args) {

        String[] zodziai = new String[]{"labas", "abc", "langas","kompiuteris" };

        String atsakymas = gautiIlgiausiaZodi(zodziai);

        System.out.println("Ilgiausias masyvo zodis: " + atsakymas);

    }

    public static String gautiIlgiausiaZodi(String[] zodis) {
        int maxIlgis = 0;
        String igiausiasStringas = null;
        for (String x : zodis) {
            if (x.length() > maxIlgis) {
                maxIlgis = x.length();
                igiausiasStringas = x;
            }
        }
        return igiausiasStringas;
    }
}