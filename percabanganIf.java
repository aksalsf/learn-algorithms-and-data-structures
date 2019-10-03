import java.util.Scanner;
public class percabanganIf {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	int nilai;
	// Input
	System.out.print("Masukkan nilai Anda =>");
	nilai = data.nextInt(); data.nextLine();
	// If
	if (nilai <= 60) {
		System.out.println("Maaf, Anda harus mengulang");
	} else {
		System.out.println("Selamat, Anda lulus");
	}
	}
}