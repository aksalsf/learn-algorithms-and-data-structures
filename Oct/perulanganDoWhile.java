import java.util.Scanner;
public class perulanganDoWhile {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi variabel
	int i;
	char print;
	// Perulangan
	i = 1;
	do {
		System.out.println("Selamat datang");
		System.out.println("Senang bertemu Anda untuk ke-"+i+" kalinya");
		System.out.print("Masukkan karakter => ");
		print = data.next().charAt(0);data.nextLine();
		i++;
	} while (print != 'x' && print != 'X');

	}
}