import java.util.Scanner;
public class rapotArray{
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Deklarasi
	int i, jumlahSiswa;
	double rataMath, rataAlgo, jumlahMath = 0, jumlahAlgo = 0;
	// Input
	System.out.print("Berapa jumlah siswa Anda? => ");
	jumlahSiswa = data.nextInt();data.nextLine();
	// Array
	String[] namaSiswa = new String[jumlahSiswa];
	double[] nilaiMath = new double[jumlahSiswa];
	double[] nilaiAlgo = new double[jumlahSiswa];
	double[] rataSiswa = new double[jumlahSiswa];
	// Start
	for (i=0; i<jumlahSiswa; i++) {
		// Input
		System.out.print("Nama => ");
		namaSiswa[i] = data.nextLine();
		System.out.print("Nilai Matematika => ");
		nilaiMath[i] = data.nextDouble();data.nextLine();
		System.out.print("Nilai Algoritma dan Pemrogaman => ");
		nilaiAlgo[i] = data.nextDouble();data.nextLine();
		// Perhitungan
		rataSiswa[i] = (double)(nilaiMath[i]+nilaiAlgo[i])/2;
		jumlahMath = jumlahMath + nilaiMath[i];
		jumlahAlgo = jumlahAlgo + nilaiAlgo[i];
	}
	// Rata - rata
	rataMath = (double)jumlahMath/jumlahSiswa;
	rataAlgo = (double)jumlahAlgo/jumlahSiswa;
	// Output
	System.out.println("Daftar Nilai");
	System.out.println("============================");
	for (i=0; i<jumlahSiswa; i++) {
		System.out.println(namaSiswa[i]);
		System.out.println("Nilai Matematika => " + nilaiMath[i]);
		System.out.println("Nilai Algoritma => " + nilaiAlgo[i]);
		System.out.println("Rata-rata => " + rataSiswa[i]);
		System.out.println();
	}
	System.out.println("Rata-rata Matematika => " + rataMath);
	System.out.println("Rata-rata Algoritma dan Pemrogaman => " + rataAlgo);
	System.out.println("============================");
	}
}