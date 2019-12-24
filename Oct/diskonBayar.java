import java.util.Scanner;
public class diskonBayar {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variable
	double diskon, harga, hargaDiskon, total;
	// Input
	System.out.print("Harga => ");
	harga = data.nextDouble(); data.nextLine();
	// Proses
	if (harga >= 100000) {
		diskon = 0.1;
		hargaDiskon = diskon * harga;
	} else if (harga >= 50000) {
		diskon = 0.05;
		hargaDiskon = diskon * harga;
	} else {
		diskon = 0;
		hargaDiskon = diskon * harga;
	}
	total = harga - hargaDiskon;
	// Output
	System.out.println("Diskon => " + diskon);
	System.out.println("Total Belanja => " + total);
	}
}