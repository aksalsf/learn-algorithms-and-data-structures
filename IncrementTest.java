import java.util.Scanner;
public class IncrementTest {
	static Scanner data = new Scanner (System.in);
	public static void main (String [] args) {
	// Deklarasi Variable
	int x, y;
	// Program starts
	System.out.println("Aplikasi Increment");
	System.out.print("Nilai x =>");
	x = data.nextInt(); data.nextLine();
	System.out.println(x);
	int i = 1;
	while (i < 100) {
	System.out.println(++x);
	i++;
	}
	System.out.print("Nilai y =>");
	y = data.nextInt(); data.nextLine();
	System.out.println(y);
	int z = 1;
	while (z < 100) {
	System.out.println(--y);
	z++;
	}
}
}