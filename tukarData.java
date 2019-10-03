import java.util.Scanner;
public class tukarData {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Variabel
	String hewan, tumbuhan, tukar;
	// Input
	System.out.print("Hewan  => ");
	hewan = data.nextLine();
	System.out.print("Tumbuhan => ");
	tumbuhan = data.nextLine();

	System.out.println("Sebelum");
	System.out.println("Hewan => " + hewan);
	System.out.println("Tumbuhan => " + tumbuhan);
	// Proses
	tukar = hewan;
	hewan = tumbuhan;
	tumbuhan = tukar;
	// Output
	System.out.println("Sesudah");
	System.out.println("Hewan => " + hewan);
	System.out.println("Tumbuhan => " + tumbuhan);
	}
}