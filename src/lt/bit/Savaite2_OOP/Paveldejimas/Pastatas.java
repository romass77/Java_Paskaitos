package lt.bit.Savaite2_OOP.Paveldejimas;

public class Pastatas{
    private  double bendrasPlotas;
    private double kvadratinioMetroKaina;
    private String pastatoTipas;

    public Pastatas(double bendrasPlotas, double kvadratinioMetroKaina, String pastatoTipas) {
        this.bendrasPlotas = bendrasPlotas;
        this.kvadratinioMetroKaina = kvadratinioMetroKaina;
        this.pastatoTipas = pastatoTipas;
    }

    public double getBendrasPlotas() {
        return bendrasPlotas;
    }

    public double getKvadratinioMetroKaina() {
        return kvadratinioMetroKaina;
    }

    public String getPastatoTipas() {
        return pastatoTipas;
    }
}

