import java.util.Scanner;
public class absolut {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi
		int n;
		// Input
		System.out.println("Aplikasi Mencari Nilai Absolut");
		garis();
		n = data.nextInt();data.nextLine();
		garis();
		System.out.println("=> " + absolut(n));

	}
	public static void garis() {
		System.out.println("=================================");
	}
	public static int absolut(int n) {
		if (n<0) {
			n=0-n;
		}
		return n;
	}
}