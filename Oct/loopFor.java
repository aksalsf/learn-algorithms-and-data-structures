import java.util.Scanner;
public class loopFor {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int i, n;
	// Input
	System.out.print("Nilai i => ");
	i = data.nextInt();data.nextLine();
	System.out.print("Nilai n => ");
	n = data.nextInt();data.nextLine();
	// Perulangan 1
	for (i=i; i<=n; i++) {
		System.out.println("Kloning ke-" + i + " ");
	}
	// Perulangan 2
	for (i=n; i>=1; i--) {
		System.out.println("Kloning ke-" + i + " ");
	}
	// Perulangan 3
	for (i=i; i<=n; i++) {
		System.out.print(i + " ");
	}
	}
}