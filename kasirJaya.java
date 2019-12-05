import java.util.Scanner;
public class kasirJaya {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	String[] namaBarang = {"Motherboard", "CPU", "RAM", "VGA Card", "Heatsink"};
	int[] kodeBarang = {0, 1, 2, 3, 4};
	double[] hargaBarang = {500, 1500, 600, 1000, 150};
	int[] stokBarang = {30, 40, 50, 20, 45};
	// List Barang
	System.out.println("===============================, ==");
	System.out.println("Selamat Datang di Toko Kasir Jaya");
	System.out.println("=================================");
	for (int i=0; i<kodeBarang.length; i++) {
		System.out.println(namaBarang[i]);
		System.out.println("Kode Barang => " + kodeBarang[i]);
		System.out.println("Harga => " + hargaBarang[i]);
		System.out.println("Stok => " + stokBarang[i]);
		System.out.println("------------------------");
	}
	System.out.println("=================================");
	// Jumlah Transaksi
	int jumlahTransaksi;
	System.out.print("Anda beli berapa jenis barang? => ");
	jumlahTransaksi = data.nextInt(); data.nextLine();
	// Deklarasi Variabel
	int kodeB, i;
	double totalHarga = 0;
	String[] barangBeli = new String[jumlahTransaksi];
	int[] jumlahBeli = new int[jumlahTransaksi];
	double[] hargaBeli = new double[jumlahTransaksi];
	// Transaksi
	for (i=0; i<jumlahTransaksi; i++) {
		System.out.print("Masukkan Kode Barang => ");
		kodeB = data.nextInt();data.nextLine();
		System.out.print("Jumlah Barang => ");
		jumlahBeli[i] = data.nextInt();data.nextLine();
		barangBeli[i] = namaBarang[kodeB];
		hargaBeli[i] = hargaBarang[kodeB];
		totalHarga = totalHarga + (hargaBeli[i]*jumlahBeli[i]);
	}
	// Cetak Kwitansi
	System.out.println("=====================================");
	System.out.println("========== Toko Kasir Jaya ==========");
	System.out.println("=====================================");
	for (i=0; i<jumlahTransaksi; i++) {
		System.out.println(barangBeli[i] + " : $" + hargaBeli[i] + " x " + jumlahBeli[i] + " = $" + (hargaBeli[i]*jumlahBeli[i]));
	}
	System.out.println("Total : $" + totalHarga);
	System.out.println("=====================================");
	System.out.println("Terima kasih atas kunjungan Anda :)");
	System.out.println("=====================================");
	}
}