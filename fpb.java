import java.util.Scanner;
public class fpb {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    // Deklarasi Variabel
    int a, b, c;
    // Input
    System.out.print("Angka Pertama => ");
    a = data.nextInt();data.nextLine();
    System.out.print("Angka Kedua => ");
    b = data.nextInt();data.nextLine();
    // Proses
    c = a % b;
	while ( c != 0) {
	a = b;
	b = c;
	c = a % b;
    }
    // Output
	System.out.println("Maka FPB-nya adalah " + b);
    }
}