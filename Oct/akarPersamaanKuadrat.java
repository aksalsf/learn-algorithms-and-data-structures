import java.util.Scanner;
public class akarPersamaanKuadrat {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	double a, b, c, D, x1, x2;
	String statusAkar, definit;
	// Input
	System.out.println("ax^2+bx+c");
	System.out.println("Nilai a =>");
	a = data.nextDouble();data.nextLine();
	System.out.println("Nilai b =>");
	b = data.nextDouble();data.nextLine();
	System.out.println("Nilai c =>");
	c = data.nextDouble();data.nextLine();
	// Proses
	D = (b * b)-4*a*c;
	x1 = (-b + Math.sqrt(D)) / 2 * a;
	x2 = (-b - Math.sqrt(D)) / 2 * a;
	if (D < 0) {
		if (a < 0) {
			definit = "negatif";
		} else {
			definit = "positif";
		}
	} else {
		definit = "tidak keduanya";
	}
	// Output
	if (D > 0) {
		if (D == 0) {
			statusAkar = "sama";
		} else {
			statusAkar = "nyata";
			System.out.println("Nilai x1 =>" + x1);
			System.out.println("Nilai x2 =>" + x2);
		}
	} else {
		statusAkar = "khayal";
	}
	System.out.println("Status akarnya  " + statusAkar);
	System.out.println("Definit => " + definit);
	}
}