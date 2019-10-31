import java.util.Scanner;
public class perulanganWhile {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi
	int i, n;
	char print;
	// Input
	System.out.print("Nilai n => ");
	n = data.nextInt();data.nextLine();
	// Perulangan
	i = 1;
	while (i<=n) {
		System.out.print(i+" ");
		i++;
	}
	System.out.println(" ");
	// Perulangan dengan konfirmasi
	print='y';
	i=1;
	while (print != 'x' && print != 'X') {
		System.out.println("Selamat datang");
		System.out.println("Senang bertemu Anda untuk ke-"+i+" kalinya");
		System.out.print("Masukkan karakter => ");
		print = data.next().charAt(0);data.nextLine();
		i++;
	}
	}
}
