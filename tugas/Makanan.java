public class Makanan {
  protected String namamkn;
  protected Integer harga;
  protected String jenismkn;
  

  public void Informasimakanan() {
	
    System.out.print("NAMA MAKANAN          : " + namamkn + "\n");
    System.out.print("Jenis Makanan    : " + jenismkn + " \n");
    System.out.print("Harga Makanan   : " + harga + "\n");
    System.out.print("\n");
  }
}