import java.util.Scanner;
public class HitungWaktu {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variable
	double kecepatanA, kecepatanB, jarakA, jarakB, jarakAB, waktu;
	// Input
	System.out.print("Kecepatan Mobil A => ");
	kecepatanA = data.nextInt();data.nextLine();
	System.out.print("Kecepatan Mobil B => ");
	kecepatanB = data.nextInt();data.nextLine();
	System.out.print("Jarak Kedua Mobil => ");
	jarakAB = data.nextInt();data.nextLine();
	// Proses
	waktu = jarakAB/(kecepatanA + kecepatanB);
	jarakA = kecepatanA * waktu;
	jarakB = kecepatanB * waktu;
	// Output
	System.out.println("Jarak Mobil A => " + jarakA);
	System.out.println("Jarak Mobil B => " + jarakB);
	System.out.println("Keduanya akan bertemu dalam " + waktu + " jam");
	}
}