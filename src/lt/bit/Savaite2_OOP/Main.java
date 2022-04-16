package lt.bit.Savaite2_OOP;

public class Main {
    public static void main(String[] args) {
        Zmogus zmogus = new Zmogus("vardenis","opavardenis",
                1980,10,125,"vezis",
                "lietuva", "+370000000000");

zmogus.setVardas("Paulius");
System.out.println(zmogus.getVardas());

AgrigatinesBusenos.SKYSTOJI.getTemperatura();
        System.out.println(AgrigatinesBusenos.DUJINE.getTemperatura());


    }
}
