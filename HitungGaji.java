import java.util.Scanner;
public class HitungGaji {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Variable
		double gajipokok, gajibersih, gajikotor, tunjangan, pajak;
		// Input
		System.out.println("Aplikasi Hitung Gaji Bersih Karyawan");
		System.out.print("Gaji Pokok => ");
		gajipokok = data.nextDouble(); data.nextLine();
		// Proses
		tunjangan = (double) 10/100 * gajipokok;
		gajikotor = gajipokok + tunjangan;
		pajak = (double) 5/100 * gajikotor;
		gajibersih = gajikotor - pajak;
		// Output
		System.out.print("Gaji Bersih => " + gajibersih);
	}
}