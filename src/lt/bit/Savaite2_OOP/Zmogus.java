package lt.bit.Savaite2_OOP;

public class Zmogus {

    // access modifiers -> privat->default-> protected-> public
   private String vardas;
    String pavarde;
    int gimimoMetai;
    double svoris;
    int ugis;
    String zodiakoZenklas;
    String adresas;
    String telefonoNumeris;

    //Konstruktorius -> constructor


    public Zmogus(String vardas, String pavarde, int gimimoMetai,
                  double svoris, int ugis, String zodiakoZenklas,
                  String adresas, String telefonoNumeris) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
        this.svoris = svoris;
        this.ugis = ugis;
        this.zodiakoZenklas = zodiakoZenklas;
        this.adresas = adresas;
        this.telefonoNumeris = telefonoNumeris;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
// ALT+Insert
}
