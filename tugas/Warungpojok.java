import java.util.Scanner;

public class Warungpojok extends Pembayaran {
  public static String NamaWarung;
  public static String Alamat;
  public static String Telpon;
  
public static Scanner input = new Scanner(System.in);
  public static Warungpojok warjok= new Warungpojok();
  public static Makanan makan1 = new Makanan();
  public static Makanan makan2 = new Makanan();
  public static Makanan makan3 = new Makanan();
  public static Minuman minum1 = new Minuman();
  public static Minuman minum2 = new Minuman();
  public static Minuman minum3 = new Minuman();
  
Warungpojok (){
		//this dengan konstruktor
		this.NamaWarung =	"Warung Pojok 21";
		this.Alamat = "Jalan dago pojok no 21 ";
		this.Telpon= "085880840616";
	}
  
  
	public static void informasi() { 
   
    System.out.print("Nama Warung    : " + NamaWarung + "\n");
    System.out.print("Alamat       : " + Alamat + "\n");
    System.out.print("Telepon      : " + Telpon + "\n");
    System.out.print("\n");
  }
	public static void Informasimakanan(){
	makan1.namamkn = "NASI GORENG";
    makan1.jenismkn = "NASI GORENG BUTO HIJO";
    makan1.harga = 12000;
    
	
	makan2.namamkn = "AYAM ";
    makan2.jenismkn = "AYAM PENYET";
    makan2.harga = 15000;
   
	
    makan3.namamkn = "MIE";
    makan3.jenismkn= "MIE GORENG JUMBO";
    makan3.harga = 8000;
    }
	
	
	public static void Informasiminuman(){
	minum1.namamin = "KOPI";
	minum1.jenismin = "KOPI HITAM";
    minum1.harga = 5000;
    
	
	minum2.namamin = "JUICE";
	minum2.jenismin = "JUICE ALPUKET";
    minum2.harga = 8000;
    
	
	minum3.namamin = "TEH ";
	minum3.jenismin = "TEH MANIS";
    minum3.harga = 5000;
    
	}
	public static void pilihan(){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("-------------------------");
	System.out.println("     Warung Pojok 21       ");
	System.out.println("-------------------------");
	System.out.println("----------MENU-----------");
	System.out.println("1.Informasi Warung");
	System.out.println("2.Informasi Makanan");
	System.out.println("3.Informasi Minuman");
	System.out.println("-------------------------");
	System.out.print("Pilih Menu : ");
	char pilih=(char) scan.nextInt();
	
      switch (pilih) {
          case 1:
              informasi(); //pemanggilan konstruktor
              break;
          case 2:
              Informasimakanan(); //pemanggilan konstruktor
			  makan1.Informasimakanan();
              makan2.Informasimakanan();
			  makan3.Informasimakanan();
              break;
          case 3:
              Informasiminuman(); //pemanggilan konstruktor
			  minum1.Informasiminuman();
			  minum2.Informasiminuman();
			  minum3.Informasiminuman();
              break;
          default:
              System.out.println("Menu Tidak Ada");
              break;
         }

	

	}
 
  public static void main(String[] args) {
    pilihan();
	}
}