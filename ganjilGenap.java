import java.util.Scanner;
public class ganjilGenap {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variable
	int angka, sisa;
	String status;
	// Input
	System.out.print("Angka => ");
	angka = data.nextInt(); data.nextLine();
	sisa = angka % 2;
	// Proses
	if (angka >= 0) {
		if (sisa == 0) {
			status = "genap";
		} else {
			status = "ganjil";
		}
		System.out.println("Angka yang Anda masukkan bernilai " + status);
	} else {
		System.out.print("Angka yang Anda masukkan bernilai negatif");
	}
	}
}