public class Warung {
  protected String nama;
  protected String pemilik;
  protected char Status;
  protected boolean Kasbon;

Warung() {
  
    nama = "Warung Pojok";
    pemilik = "Bono ";
    Kasbon = true;
    status = 'A';
  }

  public String Rewrite_Kasbon(boolean Status) {
    
    string text_Status = "Tidak";
    if (status) {
      text_status = "Ya";
    }
    return text_status;
  }

 public String Rewrite_Kasbon(char Status) { 
    String text_Status;
    switch (Status) {
      case 'A': text_status = "Kasbon"; break;
      case 'N': text_status = "Belum bayar"; break;
      case 'B': text_status = "Tambah Kasbon"; break;
      case 'D': text_status = "Lunas"; break;
      default: text_status = "Tidak diketahui"; break;
    }
return text_status;

  public void informasipemilikwarung() {
      System.out.print("-- Informasi --\n");
      System.out.print("Nama Warung       : " + nama + "\n");
      System.out.print("Pemilik Warung    : " + pemilik + "\n");
      System.out.print("Status Warung       : " + Kasbon + "\n")
      System.out.print("\n");
  }
}