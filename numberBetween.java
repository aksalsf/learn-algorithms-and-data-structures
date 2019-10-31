import java.util.Scanner;
public class numberBetween {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int a, z;
	// Input
	System.out.print("Nilai a => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Nilai z => ");
	z = data.nextInt(); data.nextLine();
	// Proses & Output
	for (int i=a; i <= z ; i++) {
		System.out.print(i + " ");
	}
	}
}