package lt.bit.Savaite2_OOP;

public enum AgrigatinesBusenos {
  KIETOJI(-1),
  SKYSTOJI(0 ),
  DUJINE(101);

  private final int temperatura;

  AgrigatinesBusenos(int temperatura){
      this.temperatura = temperatura;
  }
  public int getTemperatura(){
      return temperatura;
  }
}
