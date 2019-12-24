import java.util.Scanner;
public class percabanganIf {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	int nilai;
	String nama, statusLulus;
	char predikat;
	// Input
	System.out.print("Nama => ");
	nama = data.nextLine();
	System.out.print("Masukkan nilai Anda => ");
	nilai = data.nextInt(); data.nextLine();
	// If
	if (nilai >= 60) {
		statusLulus = "lulus";
	} else {
		statusLulus = "tidak lulus";
	}

	// Nested If
	if (nilai >= 0 && nilai <= 100) {
		if (nilai > 74) {
		predikat = 'A';
		} else if (nilai > 69) {
			predikat = 'B';
		} else if (nilai > 59) {
			predikat = 'C';
		} else if (nilai > 49) {
			predikat = 'D';
		} else {
			predikat = 'E';
		}
		// Output
		System.out.println("Hai " + nama + ", kamu " + statusLulus + " dengan predikat " + predikat);
	} else {
		System.out.println("Hai " + nama + ". Nilai yang Anda masukkan salah, silakan coba lagi.");
	}
	
	// OR
	if (statusLulus != "lulus" || nilai < 70) {
		System.out.println("Hai " + nama + ", belajar yang rajin, ya.");
	} else {
		System.out.println("Selamat " + nama + ", tingkatkan terus prestasimu, ya.");
	}

	}
}