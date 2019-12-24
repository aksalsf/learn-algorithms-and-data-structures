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
	if (z<a) {
		for (z=z; z <= a ; z++) {
		System.out.print(z + " ");
		}	
	} else { 
		for (a=a; a <= z ; a++) {
		System.out.print(a + " ");
		}	
	}
	}
}