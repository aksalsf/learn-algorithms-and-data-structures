import java.util.Scanner;
public class nilaiLulus {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	double nilai;
	String predikat;
	// Input
	System.out.print("Masukkan nilai Anda => ");
	nilai = data.nextDouble();data.nextLine();
	// Proses
	if (nilai >= 0) {
		if (nilai >= 80) {
			predikat = "Sangat baik";
		} else if (nilai >= 70) {
			predikat = "Baik";
		} else if (nilai >= 60) {
			predikat = "Cukup";
		} else {
			predikat = "Gagal";
		}

		if (predikat == "Gagal") {
			System.out.print("Maaf Anda gagal");
		} else {
			// Output
			System.out.print("Selamat Anda lulus dengan predikat " + predikat);
		}

	} else {
		System.out.print("Nilai yang Anda masukkan tidak valid");
	}
	}
}