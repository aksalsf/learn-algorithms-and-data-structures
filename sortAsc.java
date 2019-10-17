import java.util.Scanner;
public class sortAsc {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variabel
	int a, b;
	// Input
	System.out.print("Data Pertama => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Data Kedua => ");
	b = data.nextInt(); data.nextLine();
	// Proses && Output
	if (a < b) {
		System.out.println("Urutan => " + a + " " + b);
	} else {
		System.out.println("Urutan => " + b + " " + a);
	}
	}
}