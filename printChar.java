import java.util.Scanner;
public class printChar {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	char print;
	// Input
	System.out.print("Masukkan karakter => ");
	print = data.next().charAt(0);data.nextLine();
	// Perulangan
	int i=1;
	while (print != 'x' && print != 'X') {
		System.out.println(print);
		System.out.print("Masukkan karakter => ");
		print = data.next().charAt(0);data.nextLine();
		i++;
	}
	}
}