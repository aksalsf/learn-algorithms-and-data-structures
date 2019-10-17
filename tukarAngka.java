 import java.util.Scanner;
public class tukarAngka {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	int a, b;
	// Input
	System.out.print("Nilai A => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Nilai B => ");
	b = data.nextInt(); data.nextLine();
	System.out.println("Sebelum");
	System.out.println("Nilai A => " + a);
	System.out.println("Nilai B => " + b);
	// Proses
	a = a ^ b;
	b = a ^ b;
	a = a ^ b;
	// Output
	System.out.println("Sesudah");
	System.out.println("Nilai A => " + a);
	System.out.println("Nilai B => " + b);
	}
}