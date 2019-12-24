import java.util.Scanner;
public class kaliN {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int n, hasil;
	double bilangan;
	// Input
	System.out.print("Jumlah bilangan => ");
	n = data.nextInt();data.nextLine();
	// Perulangan
	hasil = 1;
	for (int i=1; i<=n; i++) {
		System.out.print("Bilangan ke-" + i + " => ");
		bilangan = data.nextDouble();data.nextLine();
		hasil = hasil * bilangan;
	}
	System.out.print("Hasilnya => " + hasil);
	}
}