import java.util.Scanner;
public class kasirTangguh {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int kodeB, i, jumlahTransaksi=0;
	double totalHarga = 0, bayar, kembalian;
	char konfirmasi;
	String[] namaBarang = {"Motherboard", "CPU", "RAM", "VGA Card", "Heatsink"};
	int[] kodeBarang = {0, 1, 2, 3, 4};
	double[] hargaBarang = {500, 1500, 600, 1000, 150};
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
		kodeB = data.nextInt();data.nextLine();
		if (kodeB == 1 || kodeB == 2 || kodeB == 3 || kodeB == 0 || kodeB == 4) {
		 	System.out.print("Jumlah Barang => ");
		 	jumlahBeli[i] = data.nextInt();data.nextLine();
		 	// Cek Stok Barang
		 	if (jumlahBeli[i]<=stokBarang[kodeB]) {
		 		stokBarang[kodeB]=stokBarang[kodeB]-jumlahBeli[i];
			 	// Proses Hitung Transaksi
			 	barangBeli[i] = namaBarang[kodeB];
			 	hargaBeli[i] = hargaBarang[kodeB];
			 	totalHarga = totalHarga + (hargaBeli[i]*jumlahBeli[i]);
				jumlahTransaksi++;
		 	} else {
		 		System.out.println("Maaf, jumlah pembelian Anda melebihi stok barang kami.");
		 	}
		} else {
			System.out.println("Maaf kode barang yang Anda masukkan salah!");
		}
		// Konfirmasi
		System.out.print("Beli lagi? (y/n) => ");
		konfirmasi = data.next().charAt(0);data.nextLine();
		i++;
	} while (konfirmasi == 'y');
	// Cetak Kwitansi
	System.out.println("=====================================");
	System.out.println("========== Toko Kasir Jaya ==========");
	System.out.println("=====================================");
	for (i=0; i<=jumlahTransaksi; i++) {
		if (barangBeli[i] != null && hargaBeli[i] != 0 && jumlahBeli[i] != 0) {
		System.out.println(barangBeli[i] + " : $" + hargaBeli[i] + " x " + jumlahBeli[i] + " = $" + (hargaBeli[i]*jumlahBeli[i]));	
		}
	}
	System.out.println("Total : $" + totalHarga);
	// Pembayaran
	System.out.print("Pembayaran : $");
	bayar = data.nextDouble(); data.nextLine();
	if (bayar<totalHarga) {
		System.out.println("Maaf uang Anda kurang!");
	} else {
		kembalian =bayar - totalHarga;
		System.out.println("Sisa : $" + kembalian);
	}
	System.out.println("=====================================");
	System.out.println("Terima kasih atas kunjungan Anda :)");
	System.out.println("=====================================");
	}
}