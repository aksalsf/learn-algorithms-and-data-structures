import java.util.Scanner;
public class rataKonfirmasi {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi variabel
	int i;
	double nilai, hasil, rata;
	char konfirmasi;
	// Start
	hasil = 0;
	i=0;
	do {
	i++;
	System.out.print("Nilai ke-" + i + " => ");
	nilai = data.nextDouble(); data.nextLine();
	System.out.print("Apakah Anda mau melanjutkan?(y/n)=> ");
	konfirmasi = data.next().charAt(0);data.nextLine();
	hasil = hasil + nilai;
	} while(konfirmasi == 'y');
	rata = (double)hasil/i;
	System.out.print("Rata-rata=> "+hasil+" / "+i+" = "+rata);
	}
}