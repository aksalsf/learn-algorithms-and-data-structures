import java.util.Scanner;
public class kasirSukses {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int i, jumlahTransaksi=0;
	double totalHarga = 0, bayar, kembalian;
	char konfirmasi, kodeB;
	String[] namaBarang = {"Motherboard", "CPU", "RAM", "VGA Card", "SSD"};
	char[] kodeBarang = {'M', 'C', 'R', 'V', 'S'};
	double[] hargaBarang = {500, 1500, 600, 1000, 750};
	int[] stokBarang = {30, 40, 50, 20, 45};
	String[] barangBeli = new String[255];
	int[] jumlahBeli = new int[255];
	double[] hargaBeli = new double[255];
	// List Barang
	System.out.println("=================================");  
	System.out.println("Selamat Datang di Toko Kasir Jaya");
	System.out.println("=================================");
	for (i=0; i<kodeBarang.length; i++) {
		System.out.println(namaBarang[i]);
		System.out.println("Kode Barang => " + kodeBarang[i]);
		System.out.println("Harga => " + hargaBarang[i]);
		System.out.println("Stok => " + stokBarang[i]);
		System.out.println("------------------------");
	}
	System.out.println("=================================");
	// Transaksi
	i = 0;
	do {
		// Input
		System.out.print("Masukkan Kode Barang => ");
		kodeB = data.next().charAt(0);data.nextLine();
		if (kodeB == 'M' || kodeB == 'C' || kodeB == 'R' || kodeB == 'V' || kodeB == 'S') {
			System.out.print("Jumlah => ");
			jumlahBeli[i] = data.nextInt();data.nextLine();
			if (jumlahBeli[i]<=stokBarang[]) {
				
			}
		} else {
			System.out.println("Maaf kode barang yang Anda masukkan salah!");
		}
		// Konfirmasi
		System.out.print("Beli lagi? (y/n) => ");
		konfirmasi = data.next().charAt(0);data.nextLine();
		i++;
	} while (konfirmasi == 'y');

	}
}