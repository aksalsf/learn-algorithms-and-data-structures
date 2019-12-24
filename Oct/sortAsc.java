import java.util.Scanner;
public class sortAsc {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variabel
	int a, b, c;
	// Input
	System.out.print("Data Pertama => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Data Kedua => ");
	b = data.nextInt(); data.nextLine();
	// Proses && Output
	if (a > b) {
		c = a;
		a = b;
		b = c;
	}
	System.out.println("Urutan => " + a + " " + b);
	}
}