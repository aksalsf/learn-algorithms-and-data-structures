import java.util.Scanner;
public class rataN {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi
	int i, n;
	double rata, x, result;
	// Input
	System.out.print("Jumlah bilangan => ");
	n = data.nextInt(); data.nextLine();
	// Start
	result = 0;
	for (i=1; i<=n; i++) {
	System.out.print("Bilangan ke" + i + " => ");
	x = data.nextDouble(); data.nextLine();
	result = x + result;
	}
	rata = (double)result/n;
	System.out.print(rata);
	}
}