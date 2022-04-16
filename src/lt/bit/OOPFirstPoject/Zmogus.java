package lt.bit.OOPFirstPoject;

public class Zmogus {

        // atributai / laukai -> class fields. (attributes)
        // access modifiers -> private -> default -> protected -> public
        private String vardas;
        private String pavarde;
        private int gimimoMetai;
        private double svoris;
        private int ugis;
        private String zodiakoZenklas;
        private String adresas;
        private String telefonoNumeris;
        private String tautybe;

        // Konstruktorius -> constructor
        public Zmogus(String vardas, String pavarde, int gimimoMetai,
                      double svoris, int ugis, String zodiakoZenklas,
                      String adresas, String telefonoNumeris) {
            this(vardas, pavarde, gimimoMetai, svoris, ugis, zodiakoZenklas, adresas, telefonoNumeris, "Lietuvos");
        }

        public Zmogus(String vardas, String pavarde, int gimimoMetai,
                      double svoris, int ugis, String zodiakoZenklas,
                      String adresas, String telefonoNumeris, String tautybe) {
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.gimimoMetai = gimimoMetai;
            this.svoris = svoris;
            this.ugis = ugis;
            this.zodiakoZenklas = zodiakoZenklas;
            this.adresas = adresas;
            this.telefonoNumeris = telefonoNumeris;
            this.tautybe = tautybe;
        }

        // Overloading -> parametru skaicius skirtingas, tipai ju skirtingi, grazinimo tipas - skirtingas.
        public Zmogus() {

        }

        // Enkapsulacija -> Encapsulation
        public String getVardas() {
            return vardas;
        }

        public int getKiekMetu() {
            return 2022 - gimimoMetai;
        }
    }

