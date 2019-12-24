import java.util.Scanner;
public class SnAritmatika {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi Variabel
	int a, n, b, i, Un, Sn;
	// Input
	System.out.print("Nilai a => ");
	a = data.nextInt(); data.nextLine();
	System.out.print("Nilai n => ");
	n = data.nextInt(); data.nextLine();
	System.out.print("Nilai b => ");
	b = data.nextInt(); data.nextLine();
	// Proses 
	Sn = 0;
	for (i=1; i<=n; i++) {
		Un = a+(i-1)*b;
		Sn = Sn + Un;
	}
	System.out.print("Maka hasil dari S" + n + " => " + Sn);
	}
}