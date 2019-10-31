import java.util.Scanner;
public class totalGaji {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	double gajiPokok, pajak, gaji;
	char golongan;
	// Input
	System.out.println("Selamat Datang");
	System.out.print("Anda golongan berapa? => ");
	golongan = data.next().charAt(0);data.nextLine();
	// Proses
	switch (golongan) {
		case '1':
		gajiPokok = 1000000;
		pajak = 0 * gajiPokok;
		break;
		case '2':
		gajiPokok = 2000000;
		pajak = 0 * gajiPokok;
		break;
		case '3':
		gajiPokok = 3000000;
		pajak = (double)2/100 * gajiPokok;
		break;
		default:
	 ,	gajiPokok = 0;
		pajak = 0;
		System.out.println("Golongan yang Anda masukkan salah!");
		break;
	}
	// Output
	gaji = gajiPokok - pajak;
	System.out.print("Total Gaji => " + gaji);
	}
}