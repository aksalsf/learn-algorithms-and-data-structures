import java.util.Scanner;
public class kpk {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    // Deklarasi Variabel
    int a, b, c, i;
    // Input
    System.out.print("Angka pertama => ");
    a = data.nextInt();data.nextLine();
    System.out.print("Angka kedua => ");
    b = data.nextInt();data.nextLine();
    // Proses
    c = 0;
    for(i=1; i<=b; i++) {
		c = (c + a);
		if(c % b==0) {
			System.out.println("KPK dari angka "+a+" dan "+b+" adalah "+c);
			break;
			}
		}
    }
}