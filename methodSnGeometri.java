import java.util.Scanner;
public class methodSnGeometri {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
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
	    double Sn = 0;
	    double Un = 0;
	    for(int i=1; i<=n; i++) {
	        Un = a*(Math.pow(r, (n-1)));
	        Sn = Sn + Un;
	    }
	    return Sn;
	}
}