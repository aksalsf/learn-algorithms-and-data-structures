import java.util.Scanner;
public class TotalHarga {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variable
	double jumlahA, jumlahB, hargaA, hargaB, diskonA, diskonB, totalA, totalB, total;
	hargaA = 1000;
	hargaB = 2000;
	diskonA = (double)10/100 * hargaA;
	diskonB = (double)5/100 * hargaB;
	// Input
	System.out.println("Harga Barang A => " + hargaA);
	System.out.println("Harga Barang B => " + hargaB);
	System.out.print("Jumlah Barang A yang dibeli => ");
	jumlahA = data.nextInt();data.nextLine();
	System.out.print("Jumlah Barang B yang dibeli => ");
	jumlahB = data.nextInt();data.nextLine();
	// Proses
	totalA = jumlahA * hargaA - diskonA;
	totalB = jumlahB * hargaB - diskonB;
	total = totalA + totalB;
	//Output
	System.out.println("Total Harga Barang A => " + totalA);
	System.out.println("Total Harga Barang B => " + totalB);
	System.out.println("Total Harga Barang => " + total);
	}
}