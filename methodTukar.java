import java.util.Scanner;
public class methodTukar {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		String a,b;
		// Input
		System.out.println("Aplikasi Tukar Barang");
		System.out.print("Barang 1 => ");
		a = data.nextLine();
		System.out.print("Barang 2 => ");
		b = data.nextLine();
		// Hasil
		System.out.println(a + " <=> " + b);
		tukar(a,b);
	}
	public static String[] tukar(String x, String y) {
		String z;
		z = x;
		x = y;
		y = z;
		String[] output = {x, y};
		System.out.println("Barang 1 => " + x);
		System.out.println("Barang 2 => " + y);
		return output;
	}
}