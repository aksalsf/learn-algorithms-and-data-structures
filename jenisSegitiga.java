import java.util.Scanner;
public class jenisSegitiga {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		double a,b,c;
		// Input
		System.out.println("Aplikasi Menentukan Jenis Segitiga");
		System.out.println("Masukkan Ketiga Sisi");
		System.out.print("a => ");
		a = data.nextDouble();data.nextLine();
		System.out.print("b => ");
		b = data.nextDouble();data.nextLine();
		System.out.print("c => ");
		c = data.nextDouble();data.nextLine();
		// Hasil
		System.out.print(tebakSisi(a,b,c));
	}
	public static String tebakSisi(double x, double y, double z) {
		String jenis;
		if (x!=0 && y!=0 && z!=0) {
			if (x == y && x == z) {
				jenis = "Segitiga Sama Sisi";
			} else if (x == y || x == z || y == z) {
				jenis = "Segitiga Sama Kaki";
			} else {
				jenis = "Segitiga Sembarang";
			}
		} else {
			System.out.println("Nilai yang Anda masukkan salah!");
			jenis = "Segitiga Fana";
		}
		return jenis;
	}
}