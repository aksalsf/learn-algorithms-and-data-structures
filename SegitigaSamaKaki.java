import java.util.Scanner;
public class SegitigaSamaKaki {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Variable
		double alas, alas2, tinggi, sisi, keliling, luas;
		// Input
		System.out.println("Aplikasi Hitung Luas dan Keliling Segitiga Sama Kaki");
		System.out.print("Nilai alas => ");w
		alas = data.nextDouble(); data.nextLine();
		System.out.print("Nilai tinggi => ");
		tinggi = data.nextDouble(); data.nextLine();
		// Proses
		alas2 = (double) 1/2 * alas;
		sisi = Math.sqrt(Math.pow(alas2, 2) + Math.pow(tinggi, 2));
		keliling = (2 * sisi) + alas;
		luas = (double) 1/2 * (alas * tinggi);
		// Output
		System.out.println("Sisi => " + sisi);
		System.out.println("Keliling => " + keliling);
		System.out.println("Luas => " + luas);
	}
}