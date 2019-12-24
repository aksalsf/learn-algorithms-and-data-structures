import java.util.Scanner;
public class method {
	static Scanner data = new Scanner (System.in);
	// Method tanpa Parameter
	public static void br() {
		System.out.println();
	}
	public static void garis() {
		System.out.println("=================================");
	}
	// Method dengan Parameter
	public static double operasiBilangan(char operator, double x, double y) {
		double z;
		switch (operator) {
			case '+':
				z = x + y;
				break;
			case '-':
				z = x - y;
				break;
			case '*':
				z = x * y;
				break;
			case '/':
				z = x / y;
				break;
			case '%':
				z = x % y;
				break;
			default:
				System.out.println("Operator yang Anda masukkan salah!");
				z = 0;
				break;
		}
		return z;
	}
	// Main
	public static void main(String[] args) {
		// Deklarasi Variabel
		double a, b;
		char operator;
		// Input
		garis();
		System.out.println("Selamat datang di kalkulator java");
		garis();
		a = data.nextDouble(); data.nextLine();
		operator = data.next().charAt(0);data.nextLine();
		b = data.nextDouble(); data.nextLine();
		garis();
		System.out.print("=> " + operasiBilangan(operator, a, b));
	}
}