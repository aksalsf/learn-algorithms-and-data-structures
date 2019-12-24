import java.util.Scanner;
public class hitungDurasi {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variable
	int jamMulai, jamAkhir, menitMulai, menitAkhir, detikMulai, detikAkhir, selisih, sisa, durasiJam, durasiMenit, durasiDetik;
	// Input
	// Awal
	System.out.print("Jam Awal => ");
	jamMulai = data.nextInt(); data.nextLine();
	System.out.print("Menit => ");
	menitMulai = data.nextInt(); data.nextLine();
	System.out.print("Detik => ");
	detikMulai = data.nextInt(); data.nextLine();
	// Akhir
	System.out.print("Jam Selesai => ");
	jamAkhir = data.nextInt(); data.nextLine();
	System.out.print("Menit => ");
	menitAkhir = data.nextInt(); data.nextLine();
	System.out.print("Detik => ");
	detikAkhir = data.nextInt(); data.nextLine();
	// Proses
	selisih = ((jamAkhir * 3600)+(menitAkhir * 60)+detikAkhir)-((jamMulai * 3600)+(menitMulai * 60)+detikMulai);
	sisa = selisih % 3600;
	durasiJam = selisih/3600;
	durasiMenit = sisa/60;
	durasiDetik = sisa % 60;
	// Output
	System.out.println("Durasi => " + durasiJam + " jam " + durasiMenit + " menit " + durasiDetik + " detik ");
	}
}