package lt.bit.OOPFirstPoject;


public enum AgregatinesBusenos {
    KIETOJI(-1),
    SKISTOJI(0),
    DUJINE(101);

    private final int temperatura;

    AgregatinesBusenos(int temperatura){
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}


