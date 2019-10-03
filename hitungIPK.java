import java.util.Scanner;
public class hitungIPK {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	double matematika, algoritma, rata;
	// Input
	System.out.print("Nilai Matematika => ");
	matematika = data.nextDouble(); data.nextLine();
	System.out.print("Nilai Algoritma => ");
	algoritma = data.nextDouble(); data.nextLine();
	// Proses
	rata = (double)((matematika * 2) + (algoritma * 3)) / 5;
	// Output
	System.out.println("Rata-rata => " + rata);
	}
}