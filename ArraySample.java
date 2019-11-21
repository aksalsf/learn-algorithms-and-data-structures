import java.util.Scanner;
public class ArraySample {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    int i,n;
    // Input
    System.out.println("Aplikasi Hitung Rata-Rata");
    System.out.print("Jumlah Nilai => ");
    n = data.nextInt(); data.nextLine();
    // Deklarasi
    double jumlah=0, rata;
    double[] nilai = new double[n];
    for (i=0; i<n; i++) {
    	System.out.print("Nilai ke-" + i + " => ");
    	nilai[i] = data.nextDouble(); data.nextLine();
    }
    for (i=0; i<n; i++) {
    	jumlah=jumlah+nilai[i];
    }
    rata = jumlah/n;
    System.out.print("Rata-Rata => " + rata);

    }
}