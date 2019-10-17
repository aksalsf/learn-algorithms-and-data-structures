import java.util.Scanner;
public class nilaiMax {
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
	// Proses
	d = a;
	if (b > d) {
		d = b;
	}
	if (c > d) {
		d = c;
	}
	System.out.println("Bilangan Terbesar => " + d);
	}
}