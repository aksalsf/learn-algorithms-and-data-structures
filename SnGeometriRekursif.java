import java.util.Scanner;
public class SnGeometriRekursif {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		double a,r,n;
		// Input
		System.out.print("a => ");
		a = data.nextDouble();data.nextLine();
		System.out.print("r => ");
		r = data.nextDouble();data.nextLine();
		System.out.print("n => ");
		n = data.nextDouble();data.nextLine();
		// Hasil
		System.out.println("Hasil => " + Sn(a,r,n));
	}
	public static double Sn(double a, double r, double n) {
		double Un,Sn=0;
		if (n>=1) {
			Un = a*(Math.pow(r, (n-1)));
			Sn = Un+Sn(a,r,n-1);
		}
		return Sn;
	}
}