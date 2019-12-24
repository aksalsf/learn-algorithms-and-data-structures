import java.util.Scanner;
public class InputScanner {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
		// Variable
		int umur;
		double tinggi;
		String nama;
		char gender;
		boolean aktif;
		// Program starts
		System.out.println("Aplikasi Generate Narasi Bibliografi");
		System.out.print("Siapa nama Anda? =>");
		// Membuat input string
		nama = data.nextLine();
		System.out.print("Berapa usia Anda? =>");
		// Membuat input integer
		umur = data.nextInt(); data.nextLine();
		System.out.print("Anda seorang (L/P)? =>");
		// Membuat input char
		gender = data.next().charAt(0);data.nextLine();
		System.out.print("Berapakah tinggi Anda? (Meter) =>");
		// Membuat input double
		tinggi = data.nextDouble(); data.nextLine();
		System.out.print("Anda mahasiswa aktif? (true/false) =>");
		// Membuat input boolean
		aktif = data.nextBoolean(); data.nextLine();
		System.out.println("Berikut Bibliografi Anda =>");
		System.out.println("Nama saya " + nama + ", usia saya " + umur + " tahun.");
		System.out.println("Saya seorang " + gender + " dengan tinggi badan " + tinggi + " meter");
		System.out.println("Apakah saya mahasiswa aktif? => " + aktif);
	}
}