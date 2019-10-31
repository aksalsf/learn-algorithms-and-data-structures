import java.util.Scanner;
public class loopDeret {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	int i, n;
	System.out.print("Nilai n => ");
	n = data.nextInt();data.nextLine();
	// Deret Genap
	// Cara 1
	for (i=2; i<=n; i++) {
		System.out.print(i+" ");
	}
	System.out.println(" ");
	// Cara 2
	for (i=1; i<=n; i++) {
		if (i%2==0) {
		System.out.print(i+" ");
		}
	}
	System.out.println(" ");
	// Cara 3
	int un;
	for (i=1; i<=n; i++) {
		un=2*i;
		System.out.print(un+" ");
	}
	System.out.println(" ");
	// Deret Ganjil
	for (i=1; i<=n; i++) {
		un=2*i-1;
		System.out.print(un+" ");
	}
	System.out.println(" ");
	}
}