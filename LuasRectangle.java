import java.util.Scanner;
public class LuasRectangle {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Variable
		double panjang, lebar, luas;
		// Input
		System.out.println("Aplikasi Hitung Luas Persegi Panjang");
		System.out.print("Nilai panjang => ");
		panjang = data.nextDouble(); data.nextLine();
		System.out.print("Nilai lebar => ");
		lebar = data.nextDouble(); data.nextLine();
		// Proses
		luas = panjang * lebar;
		// Output
		System.out.print("Hasil => " + luas);
	}
}