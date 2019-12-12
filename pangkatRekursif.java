import java.util.Scanner;
public class pangkatRekursif {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int bilangan, pangkat;
		// Input
		System.out.print("Bilangan => ");
		bilangan = data.nextInt();data.nextLine();
		System.out.print("Pangkat => ");
		pangkat = data.nextInt();data.nextLine();
		System.out.println("Hasil => " + pangkat(bilangan,pangkat));
	}
	public static int pangkat(int x, int n) {
		int hasil=1;
		if (n>=1) {
			hasil=x*pangkat(x,n-1);
		}
		return hasil;
	}
}