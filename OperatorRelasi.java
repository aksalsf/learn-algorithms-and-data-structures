import java.util.Scanner;
public class OperatorRelasi {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variable
	int x, y;
	boolean status;
	// Program starts
	System.out.println("Aplikasi Perbandingan");
	System.out.print("Nilai x =>");
	x = data.nextInt(); data.nextLine();

	System.out.print("Nilai y =>");
	y = data.nextInt(); data.nextLine();

	status = (x < y); System.out.println("Apakah x < y ?=>" +status);
	status = (x >= y); System.out.println("Apakah x >= y? =>" +status);
	status = (x != y); System.out.println("Apakah x != y? =>" +status);
	status = (x == y); System.out.println("Apakah x == y? =>" +status);
}
}
