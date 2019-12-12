import java.util.Scanner;
public class methodMax {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int x, y, z;
		// Input
		System.out.println("Aplikasi Mencari Nilai Maksimum");
		System.out.println("Masukkan Tiga Angka");
		x = data.nextInt();data.nextLine();
		y = data.nextInt();data.nextLine();
		z = data.nextInt();data.nextLine();
		System.out.print("Nilai Maksimum => " + max(x,y,z));
	}
	public static int max(int a, int b, int c) {
		int d = a;
		if (b > d) {
			d = b;
		}
		if (c > d) {
			d = c;
		}
		return d;
	}
}