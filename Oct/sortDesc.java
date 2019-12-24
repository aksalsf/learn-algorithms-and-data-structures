import java.util.Scanner;
public class sortDesc {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variabel
	int a, b, c, d;
	// Input
	System.out.print("Data Pertama => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Data Kedua => ");
	b = data.nextInt(); data.nextLine();
	System.out.print("Data Ketiga => ");
	c = data.nextInt(); data.nextLine();
	System.out.println("Sebelum diurutkan => " + a + " " + b + " " + c);
	// Proses && Output
	if (b < c) {
		d = b;
		b = c;
		c = d;
	}
	if (a < b) {
		d = a;
		a = b;
		b = d;
	}
	if (b < c) {
		d = b;
		b = c;
		c = d;
	}
	System.out.println("Urutan => " + a + " " + b + " " + c);
	}
}