import java.util.Scanner;
public class percabanganSwitch {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Deklarasi
	int pilih, hargaKamar, hargaMakan, harga;
	char kelas;
	// Input Kamar
	System.out.println("Kelas Kamar yang Tersedia:");
	System.out.println("Kelas S : Kamar Presiden");
	System.out.println("Kelas A : Kamar VIP");
	System.out.println("Kelas B : Kamar Biasa");
	System.out.print("Kelas kamar yang Anda pilih => ");
	kelas = data.next().charAt(0);data.nextLine();
	// Switch Integer
	switch (kelas) {
		case 'S' : 
		System.out.println("Anda memesan Kamar Presiden");
		hargaKamar = 1000000000;
		break;
		case 'A' :
		System.out.println("Anda memesan Kamar VIP");
		hargaKamar = 500000000;
		break;
		case 'B' :
		System.out.println("Anda memesan Kamar Biasa");
		hargaKamar = 1000000;
		break;
		default:
		System.out.println("Maaf, kamar yang Anda minta tidak tersedia");
		hargaKamar = 0;
	}
	// Input Makan
	System.out.println("Menu Hari Ini:");
	System.out.println("Paket 1 : Ayam Bakar");
	System.out.println("Paket 2 : Steak Sapi");
	System.out.println("Paket 3 : Lele Goreng");
	System.out.print("Anda mau beli paket berapa? => ");
	pilih = data.nextInt(); data.nextLine();
	// Switch Integer
	switch (pilih) {
		case 1 : 
		System.out.println("Anda memesan Ayam Bakar");
		hargaMakan = 10000;
		break;
		case 2 :
		System.out.println("Anda memesan Steak Sapi");
		hargaMakan = 25000;
		break;
		case 3 :
		System.out.println("Anda memesan Lele Goreng");
		hargaMakan = 9000;
		break;
		default:
		System.out.println("Maaf, paket yang Anda minta tidak tersedia");
		hargaMakan = 0;
	}
	harga = hargaKamar + hargaMakan;
	System.out.println("Total harga => " + harga);
	}
}