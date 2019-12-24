import java.util.Scanner;
public class methodSnAritmatika {
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
		for (int i=1; i<=n; i++) {
			Un = a+(i-1)*b;
			Sn = Sn + Un;
		}
		return Sn;
	}
}