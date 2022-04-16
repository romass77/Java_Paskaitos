package lt.bit.OOPFirstPoject;

public class Main {
    public static void main(String[] args) {
        // naujas objektas / instance
        Zmogus zmogus = new Zmogus("Vardenis", "Pavardenis",
                1996, 87.5, 180,
                "Vandenis", "Adresas", "+37062131231");

        Zmogus darVienasZmogus = new Zmogus("Vardenis", "Pavardenis",
                1996, 87.5, 180,
                "Vandenis", "Adresas", "+37062131231", "Lenkijos");

        Zmogus kitasZmogus = new Zmogus();

        System.out.println(MathUtils.add(5, 3));
        System.out.println(zmogus.getVardas());

        BmwAutomobilis bmwAutomobilis = new BmwAutomobilis(BmwSeries.THIRD_SERIES);

        System.out.println(AgregatinesBusenos.KIETOJI.getTemperatura());
    }
}


