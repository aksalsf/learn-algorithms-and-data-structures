import java.util.Scanner;
public class methodPangkat {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int x,n;
		// Input
		System.out.print("Bilangan => ");
		x = data.nextInt();data.nextLine();
		System.out.print("Pangkat => ");
		n = data.nextInt();data.nextLine();
		// Hasil
		System.out.println("Hasil => " + pangkat(x,n));
	}
	public static int pangkat(int x, int n) {
		int hasil=1;
		for (int i=1; i<=n; i++) {
			hasil=hasil*x;
		}
		return hasil;
	}
}