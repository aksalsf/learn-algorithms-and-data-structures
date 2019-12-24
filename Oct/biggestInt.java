import java.util.Scanner;
public class biggestInt {
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
	if (a > b && a > c) {
		d = a;
	} else if (b > c) {
		d = b;
	} else {
		d = c;
	}
	// Output
	System.out.println("Bilangan Terbesar => " + d);
	}
}