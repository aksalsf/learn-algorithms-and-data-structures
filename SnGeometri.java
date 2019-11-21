import java.util.Scanner;
public class SnGeometri {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    // Deklarasi Variabel
    int i, n;
    double a, r, Un, Sn;
    // Input
    System.out.print("Nilai a => ");
    a = data.nextDouble();data.nextLine();
    System.out.print("Nilai r => ");
    r = data.nextDouble();data.nextLine();
    System.out.print("Nilai n => ");
    n = data.nextInt();data.nextLine();
    // Proses
    Sn = 0;
    Un = 0;
    for(i=1; i<=n; i++){
        Un = a*(Math.pow(r, (n-1)));
        Sn = Sn + Un;
    }
    System.out.println(Un);
    System.out.print("S"+n+" => "+Sn);
    }
}
