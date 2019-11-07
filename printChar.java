import java.util.Scanner;
public class printChar {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	char print;
	// Perulangan
	int i=1;
	do {
		System.out.print("Masukkan karakter => ");
		print = data.next().charAt(0);data.nextLine();
		System.out.println("karakter ke-" + i + " => " + print);
		i++;
	} while (print != 'x' && print != 'X');
	}
}