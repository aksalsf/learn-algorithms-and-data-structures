import java.util.Scanner;
public class jumlahDeret {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi
	int a, n, result;
	// Input
	System.out.print("Nilai n => ");
	n = data.nextInt(); data.nextLine();
	// Start
	a = 1;
	result = 0;
	while (a<=n) {
	result = a + result;
	a++;
	}
	System.out.print(result);
}}