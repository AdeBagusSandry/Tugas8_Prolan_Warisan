public class Pembayaran {
  protected String nama;
  protected int jenis;
  protected float uang;
  protected float totalbiaya;

  public float kembalian(float uang, float totalbiaya) {
    return (uang - totalbiaya);
  }

  public float biaya_barang(float harga, float jenis) {
    return (harga * jenis);
  }
}