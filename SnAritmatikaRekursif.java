import java.util.Scanner;
public class SnAritmatikaRekursif {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int a,b,n;
		// Input
		System.out.print("Nilai a => ");
		a = data.nextInt();data.nextLine();
		System.out.print("Nilai b => ");
		b = data.nextInt();data.nextLine();
		System.out.print("Nilai n => ");
		n = data.nextInt();data.nextLine();
		// Hasil
		System.out.println("Hasil => " + Sn(a,b,n));
	}
	public static int Sn(int a, int b, int n) {
		int Un, Sn=0;
		if (n>=1) {
			Un=a+(n-1)*b;
			Sn=Un+Sn(a,b,n-1);
		}
		return Sn;
	}
}