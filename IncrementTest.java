import java.util.Scanner;
public class IncrementTest {
	static Scanner data = new Scanner (System.in);
	public static void main (String [] args) {
	// Deklarasi Variable
	int x;
	// Program starts
	System.out.println("Aplikasi Increment");
	System.out.print("Nilai x =>");
	x = data.nextInt(); data.nextLine();
	System.out.println(x);
	int i = 1;
	while (i < 100) {
	System.out.print(++x + " ");
	i++;
	}
}
}